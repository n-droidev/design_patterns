package com.n_droidev.structural.decorator.model

import com.n_droidev.structural.decorator.model.base.IceCream

class StickIceCream:IceCream {
    override fun getBase(): String {
        return "Stick"
    }

    override fun getTopFlavor(): String {
        return "No Flavour"
    }

    override fun getTopColor(): String {
        return "White"
    }

    override fun getTopping(): String {
        return "No Topping"
    }
}