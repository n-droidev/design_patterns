package com.n_droidev.creational.abstract_factory.model.car.base

import com.n_droidev.creational.abstract_factory.factory.AbstractVehicleFactory

abstract class Car(private var model: String, private var maxSpeed: Int, private var fuelType: Enum<AbstractVehicleFactory.FuelType>) {
	
	fun go(speed: Int) {
		if (speed < maxSpeed) {
			println("$model is going at speed of $speed")
		}
	}
	
	
	fun run() {
		println("$model is running!")
	}
	
	
}