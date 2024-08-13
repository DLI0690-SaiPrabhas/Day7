public class MediaMessage extends Message {
    private String mediaUrl;

    public MediaMessage(User sender, User receiver, String content, String mediaUrl) {
        super(sender,receiver,content);
        this.mediaUrl = mediaUrl;
    }

    @Override
    public void displayMessage() {
        System.out.println("Media Message from " + getSender().getName() + " to " + getReciever().getName() + ": " + getContent() + " [Media URL: " + mediaUrl + "]");
    }
}