package bridge;

/**
 * @author hellen
 * @date 2018/7/17
 */
public class App {
    public static void main(String[] args) {
        PassengerAirPlane boepassengerAirPlane = new PassengerAirPlane(new BoeingAirPlaneMaker());
        boepassengerAirPlane.make();

        PassengerAirPlane mdpassengerAirPlane = new PassengerAirPlane(new MDPlaneMaker());
        mdpassengerAirPlane.make();

        PassengerAirPlane airBuspassengerAirPlane = new PassengerAirPlane(new AirBusPlaneMaker());
        airBuspassengerAirPlane.make();
    }
}
