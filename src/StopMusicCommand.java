// File: StopMusicCommand.java
public class StopMusicCommand implements Command {
    private final MusicPlayer player;

    public StopMusicCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }

    @Override
    public void undo() {
        player.play();
    }
}
