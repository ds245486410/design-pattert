package simplefactory;

/**
 * @author hellen
 * @date 2018/7/3
 */
public class FactoryTest {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.create("cat");
        System.out.println(cat);

        Animal  dog = AnimalFactory.create("dog");
        System.out.println(dog);

        Animal monkey = AnimalFactory.create("monkey");
        System.out.println(monkey);

    }
}
