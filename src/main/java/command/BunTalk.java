package command;

public class BunTalk {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        this.command.command();
    }
}
