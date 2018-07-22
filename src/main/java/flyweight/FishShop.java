package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class FishShop {
    FishCreateFactory fishCreateFactory;
    private List<Fish> list;
    public FishShop(FishCreateFactory fishCreateFactory) {
        this.fishCreateFactory = fishCreateFactory;
        list = new ArrayList<>();
        fillFish();
    }

    private void fillFish() {
        list.add(fishCreateFactory.create(FishTypeEnum.BALCK));
        list.add(fishCreateFactory.create(FishTypeEnum.RED));
        list.add(fishCreateFactory.create(FishTypeEnum.YELLOW));
    }

    public void iter(){
        for (Fish fish : list) {
            System.out.println(fish);
        }
    }
}
