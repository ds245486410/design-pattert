package factory;

/**
 * @author hellen
 * @date 2018/7/5
 */
public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit create() {
        return new Orange();
    }
}
