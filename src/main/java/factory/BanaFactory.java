package factory;

/**
 * @author hellen
 * @date 2018/7/5
 */
public class BanaFactory implements FruitFactory {
    @Override
    public Fruit create() {
        return new Banana();
    }
}
