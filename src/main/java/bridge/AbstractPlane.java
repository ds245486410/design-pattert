package bridge;

/**
 * @author hellen
 * @date 2018/7/17
 */
public abstract class AbstractPlane {
    public AbstractPlane(AirPlaneMaker airPlaneMaker) {
        this.airPlaneMaker = airPlaneMaker;
    }

    AirPlaneMaker airPlaneMaker;
    public  void make(){}
}
