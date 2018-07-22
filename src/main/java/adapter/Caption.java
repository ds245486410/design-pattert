package adapter;

/**
 * @author hellen
 * @date 2018/7/14
 */
public class Caption {
    FishBoat fishBoat ;

    public Caption(FishBoat fishBoat) {
        this.fishBoat = fishBoat;
    }
    void go(){
        fishBoat.row();
    }
}
