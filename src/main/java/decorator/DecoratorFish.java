package decorator;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class DecoratorFish implements Fish {
    private Fish fish;

    public DecoratorFish(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void fishing() {
        before();
        fish.fishing();
        after();
    }

    private void after() {
        System.out.println("afteer fishing");
    }

    private void before() {
        System.out.println("before fishing");
    }
}
