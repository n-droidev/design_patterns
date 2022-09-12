package com.n_droidev.behavioral.command.model

class Light : Device() {
	private var brightness=100
	
	fun changeBrightness(up:Boolean){
		print("Brightness changed from $brightness")
		if(up){
			if(brightness<=95){
				brightness+=5
			}
		}else{
			if(brightness>=5){
				brightness-=5
			}
		}
		println(" to $brightness")
	}
	
	override fun turnOn() {
		super.turnOn()
		println("Light turned on")
	}
}