package com.n_droidev.creational.abstract_factory.factory

import com.n_droidev.creational.abstract_factory.model.car.BMWCar
import com.n_droidev.creational.abstract_factory.model.car.base.Car
import com.n_droidev.creational.abstract_factory.model.motorcycle.BMWMotorcycle
import com.n_droidev.creational.abstract_factory.model.motorcycle.base.Motorcycle

class BMWFactoryAbstract: AbstractVehicleFactory() {
    override fun makeCar(): Car {
        return BMWCar("M6",300,FuelType.PETROL)
    }

    override fun makeMotorcycle(): Motorcycle {
        return BMWMotorcycle("S1000 RR",280,FuelType.PETROL)
    }
}