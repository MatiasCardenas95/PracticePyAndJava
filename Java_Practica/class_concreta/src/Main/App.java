package Main;

import Main.Player.AudioPlayer;
import Main.Player.VLC;

public class App 
{

        public static void main(String[] args) throws Exception
        {
                System.out.println("\n");
                AudioPlayer player = new AudioPlayer();
                player.open("./resources/orchestral.ogg");
                player.play();
                player.setVolume(4);
                System.out.println("\n");

                VLC vlcPlayer = new VLC();
                vlcPlayer.open("./resources/orchestral.ogg");
                vlcPlayer.play();
                vlcPlayer.setVolume(13);

                System.out.println("\n");

                
        
        }

}