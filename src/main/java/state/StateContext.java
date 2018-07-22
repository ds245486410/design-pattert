package state;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class StateContext {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void sampleSomething(){
        this.state.sampleSomething();
    }
}
