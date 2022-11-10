package Main.Player;

public class AudioPlayer {
    
    private boolean isOpen;
	private boolean isPlaying;
	private float volume;
	    
	public AudioPlayer()
	{
       	System.out.println("The AudioPlayer constructor was invoked.");
        this.isOpen = false;
       	this.isPlaying = false;
        setVolume(10);
	} 
        
        public AudioPlayer(boolean _isOpen, boolean _isPlaying,float _volume)
	    {
            isOpen = _isOpen;
            isPlaying = _isPlaying;
            volume = _volume;
	    }

	    
	    public void open (String filePath)
	    {
	        isOpen = true;
	        System.out.println("The audiofile: " + filePath + " is open.");
	    }
	    
	    public void play()
	    {
	        if(isOpen)
	        {
	            isPlaying = true;
	        }
	    }
	    
	    public void stop()
	    {
	        if(isPlaying)
	        {
	            isPlaying = false;
	        }
	    }
	    
	    public void setVolume(float value)
	    {
	        volume = value;
	        System.out.println("The volume value is:" + volume);
	    }
}
