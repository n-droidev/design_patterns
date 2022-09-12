package com.n_droidev.creational.abstract_factory.model.motorcycle

import com.n_droidev.creational.abstract_factory.factory.AbstractVehicleFactory
import com.n_droidev.creational.abstract_factory.model.motorcycle.base.Motorcycle

class HondaMotorcycle(model: String, speed: Int, fuelType: Enum<AbstractVehicleFactory.FuelType>) :
	Motorcycle(model, speed, fuelType)