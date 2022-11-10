from abc import ABC,abstractmethod
from multiprocessing.sharedctypes import Value

class Player(ABC):
        print ("The Player constructor was invoked.")
        def __init__(self,isOpen, isPlaying,setVolume ) -> None:
            super().__init__()
  

class VLC(Player):
 print( "The VLC constructor was invoked.")
 

 def open(self, filePath):
        self.isOpen = True
        print(f"The audiofile: {filePath}  is open")

 def play(self):
        #if self.isOpen: 
        self.isPlaying = True
        print("The audiofile is playing.")
 def setVolume(self,value):
        self.volume = value
        print(f"The volume value is: {value} ")
        

def setPitch(self,value):
        self.pitch = value
        print(f"The pitch value is:  {self.pitch}")

print( "The VLC destructor was invoked." )     

class Winamp(Player):
       
 print( "The Winamp constructor was invoked.")
 
 def open(self, filePath):
        self.isOpen = True
        print(f"The audiofile: {filePath}  is open")

 def play(self):
        #if self.isOpen: 
        self.isPlaying = True
        print("The audiofile is playing.")
 def setVolume(self,value):
        self.volume = value
        print(f"The volume value is: {value} ")
print( "The Winamp destructor was invoked." )
vlcPlayer=VLC(open,Value,Player)

vlcPlayer.open("./resources/orchestral.ogg")
vlcPlayer.play()
vlcPlayer.setVolume(13)

winampPlayer= Winamp(open,Value,Player)

winampPlayer.open("./resources/orchestral.ogg")
winampPlayer.play()
winampPlayer.setVolume(13)
