// Receiver class: responsible for music playback logic
public class MusicPlayer {
    private boolean isPlaying = false;

    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Music is Playing");
        } else {
            System.out.println("Music is already Playing");
        }
    }

    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music Stopped");
        } else {
            System.out.println("Music is already Stopped");
        }
    }
}
