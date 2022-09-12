package com.n_droidev.behavioral.mediator

import android.os.Handler
import android.os.Looper
import com.n_droidev.behavioral.mediator.component.CarComponent
import com.n_droidev.behavioral.mediator.component.LightComponent
import com.n_droidev.behavioral.mediator.mediator.RoadMediator

object MediatorExample {
	val roadMediator = RoadMediator()
	val car = CarComponent()
	val light = LightComponent()
	
	fun runExample() {
		car.mediator = roadMediator
		light.mediator = roadMediator
		recursive()
	}
	
	private fun recursive() {
		Handler(Looper.getMainLooper()).postDelayed({
			car.passRoad()
			recursive()
		}, 4000)
	}
}