package com.n_droidev.behavioral.mediator.component

import com.n_droidev.behavioral.mediator.component.base.Component

class CarComponent : Component() {
	fun passRoad() {
		mediator?.go(this)
	}
	
	override fun toString(): String {
		return "Car"
	}
}