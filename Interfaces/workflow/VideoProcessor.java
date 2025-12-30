import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {
    private List<NotificationChannel> channels;

    public VideoProcessor() {
        setChannels(new ArrayList<NotificationChannel>());
    }

    public void registerChannel(NotificationChannel channel) {
        this.channels.add(channel);
    }

    public void process(Video video) {
        Message message = new Message(
            String.format("%s - %s", video.getFile(), video.getFormatVideo()),
            MessageType.LOG
        );

        for (NotificationChannel channel : this.channels) {
            channel.notify(message);
            System.out.println();
        }
    }

    public List<NotificationChannel> getChannels() {
        return this.channels;
    }

    public void setChannels(List<NotificationChannel> channels) {
        this.channels = channels;
    }
}