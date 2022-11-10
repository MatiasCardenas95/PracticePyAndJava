package Main;

import Main.Classes.VLC;

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
    }
}
