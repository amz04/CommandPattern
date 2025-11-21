// File: PlayMusicCommand.java
public class PlayMusicCommand implements Command {
    private final MusicPlayer player; // receiver

    public PlayMusicCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }

    @Override
    public void undo() {
        player.stop();
    }
}
