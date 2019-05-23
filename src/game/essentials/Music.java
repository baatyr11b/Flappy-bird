package game.essentials;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Music extends Thread
{
    private String filename;
    public Music(String file)
    {
        filename = file;
    }

    @Override
    public void run()
    {
        super.run();
        try {
            String musicFile = filename;
            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setVolume(0.3);
            mediaPlayer.setCycleCount(1);
            mediaPlayer.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
