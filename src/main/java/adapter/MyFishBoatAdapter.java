package adapter;

/**
 * @author hellen
 * @date 2018/7/14
 */
public class MyFishBoatAdapter implements FishBoat {
    ScallopBoat scallopBoat = new ScallopBoat();
    @Override
    public void row() {
        scallopBoat.stretch();
    }
}
