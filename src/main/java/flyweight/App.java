package flyweight;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class App {
    public static void main(String[] args) {
        FishShop fishShop = new FishShop(new FishCreateFactory());
        fishShop.iter();
    }
}
