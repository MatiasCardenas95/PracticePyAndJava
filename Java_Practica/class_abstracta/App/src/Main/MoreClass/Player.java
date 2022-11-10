package Main.MoreClass;

public abstract class Player 
{
    private boolean isPlaying;
    private float volume;

    protected boolean isOpen;

    public Player()
    {
        System.out.println("The Player constructor was invoked.");
        isOpen = false;
        isPlaying = false;
        setVolume(10);
    }

    abstract void open(String filePath);

    public void play()
    {
        if(isOpen) isPlaying = true;
        System.out.println("The audiofile is playing.");
    }

    public void stop()
    {
        if(isPlaying) isPlaying = false;
        System.out.println("The audiofile is stopped.");

    }

    public void setVolume(float value)
    {
        volume = value;
        System.out.println("The volume value is: " + volume);
    }

}
