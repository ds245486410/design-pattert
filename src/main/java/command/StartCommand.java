package command;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class StartCommand implements Command {
    private TVReceiver tvReceiver;

    public StartCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.action();
    }
}
