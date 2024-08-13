import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Message> messages;

    public Chat() {
        this.messages = new ArrayList<>();
    }

    public void sendMessage(Message message) {
        messages.add(message);
        message.displayMessage();
    }


}