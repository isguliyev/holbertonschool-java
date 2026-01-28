public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(MediaType mediaType) {
        if (mediaType != MediaType.MP3) {
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void play(MediaType mediaType, String name) {
        if (advancedMediaPlayer == null) {
            return;
        }

        if (mediaType == MediaType.VLC) {
            this.advancedMediaPlayer.playVLC(name);
        }

        if (mediaType == MediaType.MP4) {
            this.advancedMediaPlayer.playMP4(name);
        }
    }
}