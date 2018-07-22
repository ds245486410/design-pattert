package bridge;

/**
 * @author hellen
 * @date 2018/7/17
 */
public class PassengerAirPlane extends AbstractPlane {

    public PassengerAirPlane(AirPlaneMaker airPlaneMaker) {
        super(airPlaneMaker);
    }

    @Override
    public void make() {
        System.out.println("make a passengerAirPlane");
        this.airPlaneMaker.produce();
    }
}
