package memonto;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Memonto {

    public Memonto(String state) {
        this.state = state;
    }

    private String state;

    public void saveState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
