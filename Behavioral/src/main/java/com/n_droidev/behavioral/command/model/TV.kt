package com.n_droidev.behavioral.command.model

class TV(var maxChannels: Int) : Device() {
	var currentChannel = 1
	
	fun changeChannel(directionUp: Boolean) {
		print("Channel changed from $currentChannel to ")
		if (directionUp) {
			if(currentChannel < maxChannels){
				currentChannel++
			}else{
				currentChannel=1
			}
		} else {
			if(currentChannel>1){
				currentChannel--
			}else{
				currentChannel=maxChannels
			}
		}
		print("$currentChannel\n")
	}
	
	override fun turnOn() {
		super.turnOn()
		println("TV turned on")
	}
}