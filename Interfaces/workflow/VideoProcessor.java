import java.util.ArrayList;

public class VideoProcessor {
    private ArrayList<NotificationChannel> channels;

    public VideoProcessor() {
        setChannels(new ArrayList<NotificationChannel>());
    }

    public void registerChannel(NotificationChannel channel) {
        getChannels().add(channel);
    }

    public void process(Video video) {
        Message message = new Message(String.format("%s - %s", video.getFile(),
            video.getFormatVideo()), MessageType.LOG);

        for (NotificationChannel channel : channels) {
            channel.notify(message);
            System.out.println();
        }
    }

    public ArrayList<NotificationChannel> getChannels() {
        return this.channels;
    }

    public void setChannels(ArrayList<NotificationChannel> channels) {
        this.channels = channels;
    }
}