package memonto;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Client {
    public static void main(String[] args) {
        Original original = new Original();
        original.setState("hello");
        CareTaker careTaker = new CareTaker();
        careTaker.setMemonto(original.createMemoto("hello"));
        original.restoreSate(careTaker.getMemonto());

    }
}
