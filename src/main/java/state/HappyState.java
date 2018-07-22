package state;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class HappyState implements State {
    @Override
    public void sampleSomething() {
        System.out.println("happy state");
    }
}
