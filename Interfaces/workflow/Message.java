public class Message {
    private String text;
    private MessageType messageType;

    public Message(String text, MessageType messageType) {
        setText(text);
        setMessageType(messageType);
    }

    public String getText() {
        return this.text;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}