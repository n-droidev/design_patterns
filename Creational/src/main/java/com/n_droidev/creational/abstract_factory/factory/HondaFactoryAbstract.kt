package com.n_droidev.creational.abstract_factory.factory

import com.n_droidev.creational.abstract_factory.model.car.HondaCar
import com.n_droidev.creational.abstract_factory.model.car.base.Car
import com.n_droidev.creational.abstract_factory.model.motorcycle.HondaMotorcycle
import com.n_droidev.creational.abstract_factory.model.motorcycle.base.Motorcycle

class HondaFactoryAbstract : AbstractVehicleFactory() {
    override fun makeCar(): Car {
        return HondaCar("Civic",240,FuelType.DIESEL)
    }

    override fun makeMotorcycle(): Motorcycle {
        return HondaMotorcycle("CBR600",210,FuelType.PETROL)
    }
}