public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String name) {
        System.out.printf("Playing VLC: %s\n", name);
    }

    @Override
    public void playMP4(String name) {
        System.out.printf("Playing MP4: %s\n", name);
    }
}