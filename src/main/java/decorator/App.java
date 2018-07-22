package decorator;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class App {
    public static void main(String[] args) {
        DecoratorFish decoratorFish = new DecoratorFish(new SimpleFish());
        decoratorFish.fishing();
    }
}
