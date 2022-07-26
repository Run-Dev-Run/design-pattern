package command;

public class Client {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Emoji emoji = new Emoji();

        Command chatCommend = new ChatCommand(chat);
        Command emojiCommand = new EmojiCommand(emoji);

        BunTalk bunTalk = new BunTalk();

        bunTalk.setCommand(chatCommend);
        bunTalk.run();

        bunTalk.setCommand(emojiCommand);
        bunTalk.run();
    }
}
