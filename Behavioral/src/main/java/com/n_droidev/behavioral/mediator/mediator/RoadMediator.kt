package com.n_droidev.behavioral.mediator.mediator

import com.n_droidev.behavioral.mediator.component.CarComponent

class RoadMediator {
	private var light: Light = Light.RED
	
	enum class Light {
		RED, YELLOW, GREEN
	}
	
	fun go(car: CarComponent) {
		when (light) {
			Light.GREEN ->
				println("$car passed!")
			Light.YELLOW ->
				println("$car should stop!")
			Light.RED ->
				println("$car stopped!")
		}
	}
	
	fun changeLight() {
		light = when (light) {
			Light.GREEN ->
				Light.YELLOW
			Light.YELLOW ->
				Light.RED
			Light.RED ->
				Light.GREEN
		}
		println(light.name)
	}
}