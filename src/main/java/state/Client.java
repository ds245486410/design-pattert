package state;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Client {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.setState(new HappyState());
        stateContext.sampleSomething();
    }
}
