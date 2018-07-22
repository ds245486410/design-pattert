package decorator;

/**
 * @author hellen
 * @date 2018/7/15
 */
public class SimpleFish implements Fish {
    @Override
    public void fishing() {
        System.out.println("i am fishing");
    }
}
