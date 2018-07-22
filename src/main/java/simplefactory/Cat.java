package simplefactory;

/**
 * @author hellen
 * @date 2018/7/3
 */

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat walking");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping ");
    }
}
