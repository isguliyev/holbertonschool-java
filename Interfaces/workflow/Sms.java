public class Sms implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf(
            "[%s] {%s} - %s",
            this.getClass().getSimpleName(),
            message.getMessageType(),
            message.getText()
        );
    }
}