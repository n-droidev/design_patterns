package com.n_droidev.creational.abstract_factory.model.car

import com.n_droidev.creational.abstract_factory.factory.AbstractVehicleFactory
import com.n_droidev.creational.abstract_factory.model.car.base.Car

class HondaCar(model: String, speed: Int, fuelType: Enum<AbstractVehicleFactory.FuelType>) :
	Car(model, speed, fuelType)