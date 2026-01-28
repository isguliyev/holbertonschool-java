public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(MediaType mediaType, String name) {
        if (mediaType == MediaType.MP3) {
            System.out.printf("Playing MP3: %s\n", name);
            return;
        }

        MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(mediaType);
        mediaPlayerAdapter.play(mediaType, name);
    }
}