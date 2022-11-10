package Main.MoreClass;

public class VLC extends Player
{
    private float pitch;

    public VLC()
    {
        System.out.println("The VLC constructor was invoked.");
    }

    public void open(String filePath)
    {
        isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
        
    }

    public void setPitch(float value)
    {
        pitch = value;
        System.out.println("The pitch value is: " + pitch);
    }
}
