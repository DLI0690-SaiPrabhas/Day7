public class Message{
    private User sender;
    private User reciever;
    private String content;

    public Message(User sender,User receiver,String content){
        this.sender=sender;
        this.reciever=receiver;
        this.content=content;
    }

    public User getSender() {

        return sender;
    }

    public User getReciever() {

        return reciever;
    }

    public String getContent() {

        return content;
    }
    public void displayMessage(){
        System.out.println("Message from "+sender.getName()+" to "+reciever.getName()+" is : "+content);
    }

}


