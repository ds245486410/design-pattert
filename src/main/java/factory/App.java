package factory;

/**
 * @author hellen
 * @date 2018/7/5
 */
public class App {
    public static void main(String[] args) {
        FruitFactory f1 = new AppleFactory();
        Fruit fr1 = f1.create();
        fr1.create();


        FruitFactory f12= new BanaFactory();
        Fruit fr2= f12.create();
        fr2.create();

        FruitFactory f3 = new OrangeFactory();
        Fruit fr3 = f3.create();
        fr3.create();



    }
}
