package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class WatcherSubject implements ObserverSubject {
    private WeatherTypeEnum currentWeatherType =WeatherTypeEnum.COLD ;
    private List<ObserverAble> observers = new ArrayList<>();


    @Override
    public void attach(ObserverAble observerAble) {
        observers.add(observerAble);
    }

    @Override
    public void detach(ObserverAble observerAble) {
        observers.remove(observerAble);
    }

    @Override
    public void notice() {
        for (ObserverAble observer : observers) {
            observer.doSomething(currentWeatherType);
        }
    }

    public void timespace(){
        WeatherTypeEnum[] values = WeatherTypeEnum.values();
        WeatherTypeEnum currentEenumType = values[(currentWeatherType.ordinal() + 1) % values.length];
        notice();
    }
}
