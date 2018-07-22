package simplefactory;

/**
 * @author hellen
 * @date 2018/7/3
 */
public class AnimalFactory {

    public static Animal create(String amimalName){
        Animal animal = null;
        switch (amimalName){
            case "cat" :         animal = new Cat();            break;
            case "monkey":  animal = new Monkey();     break;
            case "dog" :       animal = new Dog() ;           break;
            default:
                System.out.println("没有相应的类");
        }
        return animal;
    }
}
