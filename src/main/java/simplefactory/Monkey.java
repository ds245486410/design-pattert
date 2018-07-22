package simplefactory;

/**
 * @author hellen
 * @date 2018/7/3
 */
public class Monkey  implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog walking");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping ");
    }
}

