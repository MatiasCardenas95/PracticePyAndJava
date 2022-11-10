package Main;

import Main.MoreClass.VLC;
import Main.MoreClass.Winamp;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        VLC vlcPlayer = new VLC();

        System.out.println("\n");

        vlcPlayer.open("./resources/orchestral.ogg");
        vlcPlayer.play();
        vlcPlayer.setVolume(13);
        
        System.out.println("\n");

        Winamp winampPlayer = new Winamp();

        System.out.println("\n");

        winampPlayer.open("./resources/orchestral.ogg");
        winampPlayer.play();
        winampPlayer.setVolume(13);

        System.out.println("\n");
        
    }
}
