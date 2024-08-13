public class Main {
    public static void main(String[] args) {
        User user1 = new User("sai","@example.com");
        User user2 = new User("prabhas", "@example2.com");



        TextMessage textMessage = new TextMessage(user1, user2, "Hello,prabhas !");
        MediaMessage mediaMessage = new MediaMessage(user2, user1, "Check out this photo", "http:photo.jpg");

        Chat chat = new Chat();
        chat.sendMessage(textMessage);
        chat.sendMessage(mediaMessage);
    }
}