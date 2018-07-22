package observer;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Orcs implements ObserverAble {
    @Override
    public void doSomething(WeatherTypeEnum weatherType) {
        switch (weatherType){
            case COLD:
                System.out.println("it is cold");break;
            case HOT:
                System.out.println("it is hot");break;
            case COOL:
                System.out.println("it is cool");break;
            default:
                System.out.println("not mathc weather");
        }
    }
}
