class AudioPlayer:
    def __init__(self, isOpen, isPlaying, volume) :
        self.isOpen = isOpen
        self.isPlaying = isPlaying
        self.volume = 10
        print("The volume value is: ", self.volume)

    def open (self, filepath) :
        self.isOpen = True
        print("The audiofile:", filepath, "is open." )

    def play(self):
       if self.isOpen == True :
            self.isPlaying = True
            print("The audiofile is playing.")

    def stop(self):
        if self.isPlaying == True:
            self.isPlaying = False
            print("The audiofile is stopped.")

    def setVolume(self,value):
        self.volume = value
        print("The volume value is: ", self.volume)

class VLC(AudioPlayer):
    def __init__(self, isOpen, isPlaying, volume,pitch) :
        super().__init__(isOpen, isPlaying,volume)
        self.volume = 10
        self.pitch = 0
        print("The pitch values is:", self.pitch)
    
    def setPitch(self,value) :
        self.pitch = value
        print("The pitch values is:", self.pitch)


print("\n")

player = AudioPlayer(False,False,10)
player.open("./resources/orchestral.ogg")
player.play()
player.setVolume(4)

print("\n")

vlcPlayer = VLC(False,False,10,0)
vlcPlayer.open("./resources/orchestral.ogg")
vlcPlayer.play()
vlcPlayer.setVolume(13)


    


