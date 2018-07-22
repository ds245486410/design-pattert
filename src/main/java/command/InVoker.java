package command;

/**
 * @author hellen
 * @date 2018/7/22
 */
public class InVoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoker(Command command){
        command.execute();
    }
}
