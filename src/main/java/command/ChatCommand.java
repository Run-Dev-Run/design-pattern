package command;

public class ChatCommand implements Command {
    private final Chat chat;

    public ChatCommand(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void command() {
        chat.chat();
    }
}
