package bridge;

/**
 * @author hellen
 * @date 2018/7/17
 */
public class CargoAirPlane extends AbstractPlane {
    public CargoAirPlane(AirPlaneMaker airPlaneMaker) {
        super(airPlaneMaker);
    }

    @Override
    public void make() {
        System.out.println("cargoAirPlane");
        this.airPlaneMaker.produce();
    }
}
