package command;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class StopCommand implements Command {
    private TVReceiver tvReceiver;

    public StopCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.action();
    }
}
