
public class TextMessage extends Message{
    public TextMessage(User sender, User receiver, String content) {
        super(sender,receiver,content);
    }

    @Override
    public void displayMessage() {
        System.out.println("Text Message from " + getSender().getName() + " to " + getReciever().getName() + ": " + getContent());
    }
}
