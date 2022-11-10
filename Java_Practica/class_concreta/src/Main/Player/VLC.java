package Main.Player;

public class VLC extends AudioPlayer {
    private float pitch;
	    
    public VLC ()
    {
        System.out.println("The VLC constructor was invoked.");
        setVolume(10);
        setPitch(0);
    }
    
    public void setPitch(float value)
    {
        pitch = value;
        System.out.println("The pitch value is: " + pitch);
    }
}
