package flyweight;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class FishCreateFactory {

    public Fish create(FishTypeEnum fishTypeEnum){
        Fish fish = null;
        switch (fishTypeEnum){
            case RED: fish = new RedFish(); break;
            case YELLOW:fish = new YellowFish();break;
            case BALCK:fish = new YellowFish();break;
        }
        return fish;
    }
}
