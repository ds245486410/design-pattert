package memonto;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Original {
    private String state;
    public void restoreSate(Memonto memonto){
        this.state = memonto.getState();
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
    public Memonto createMemoto(String state){
        return new Memonto(state);
    }
}
