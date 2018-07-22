package observer;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class HobbyObserver implements ObserverAble {
    @Override
    public void doSomething(WeatherTypeEnum weatherType) {
        switch (weatherType){
            case COLD:
                System.out.println("do not play outside");break;
            case COOL:
                System.out.println("happy play"); break;
            case HOT:
                System.out.println("care the temperature");break;
        }
    }
}
