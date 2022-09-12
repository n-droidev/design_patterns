package com.n_droidev.structural.decorator.model

import com.n_droidev.structural.decorator.model.base.IceCream

class ConeIceCream: IceCream {
    override fun getBase(): String {
        return "Cone"
    }

    override fun getTopFlavor(): String {
        return "No Flavor"
    }

    override fun getTopColor(): String {
        return "White"
    }

    override fun getTopping(): String {
        return "No Topping"
    }

}