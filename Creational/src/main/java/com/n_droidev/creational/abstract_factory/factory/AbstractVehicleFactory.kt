package com.n_droidev.creational.abstract_factory.factory

import com.n_droidev.creational.abstract_factory.model.car.base.Car
import com.n_droidev.creational.abstract_factory.model.motorcycle.base.Motorcycle

abstract class AbstractVehicleFactory {
	
	enum class FuelType { DIESEL, PETROL, LPG, ELECTRIC }
	enum class Brand { BMW, Honda }
	
	companion object {
		private val bmwFactory: BMWFactoryAbstract = BMWFactoryAbstract()
		private val hondaFactory: HondaFactoryAbstract = HondaFactoryAbstract()
		
		fun getFactory(brand: Brand): AbstractVehicleFactory {
			return when (brand) {
				Brand.BMW -> {
					bmwFactory
				}
				Brand.Honda -> {
					hondaFactory
				}
			}
		}
	}
	
	abstract fun makeCar(): Car
	
	abstract fun makeMotorcycle(): Motorcycle
}