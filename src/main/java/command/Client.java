package command;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class Client {
    public static void main(String[] args) {
        TVReceiver tvReceiver = new TVReceiver();
        StopCommand stopCommand = new StopCommand(tvReceiver);
        InVoker inVoker = new InVoker();
        inVoker.invoker(stopCommand);
    }
}
