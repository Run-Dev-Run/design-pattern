package command;

public class EmojiCommand implements Command {
    private final Emoji emoji;

    public EmojiCommand(Emoji emoji) {
        this.emoji = emoji;
    }

    @Override
    public void command() {
        emoji.emoji();
    }
}
