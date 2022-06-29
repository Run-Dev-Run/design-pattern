package adapter.example;

/**
 * Adapter
 */
public class FormatAdapter implements MediaPlayer {
    private final MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }

    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }
}
