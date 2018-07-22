package factory;

/**
 * @author hellen
 * @date 2018/7/5
 */
public class Apple implements Fruit {
    @Override
    public void create() {
        System.out.println("appple fruit");
    }
}
