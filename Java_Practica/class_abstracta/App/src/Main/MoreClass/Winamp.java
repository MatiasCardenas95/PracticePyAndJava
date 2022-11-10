package Main.MoreClass;

public class Winamp extends Player
{
    public Winamp()
    {
        System.out.println("The Winamp constructor was invoked.");
    }

    public void open(String filePath)
    {
        isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
}
