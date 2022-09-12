package com.n_droidev.structural.decorator

import com.n_droidev.structural.decorator.decorator.ChocolateToppingDecorator
import com.n_droidev.structural.decorator.decorator.RedTopColorDecorator
import com.n_droidev.structural.decorator.decorator.VanillaTopFlavourDecorator
import com.n_droidev.structural.decorator.decorator.base.BaseIceCreamDecorator
import com.n_droidev.structural.decorator.model.StickIceCream
import com.n_droidev.structural.decorator.model.base.IceCream

class DecoratorExample {
    companion object{
        fun getDecoratedIceCream():IceCream{
            var stickIceCream=BaseIceCreamDecorator(StickIceCream())
            stickIceCream=VanillaTopFlavourDecorator(stickIceCream)
            stickIceCream=RedTopColorDecorator(stickIceCream)
            stickIceCream=ChocolateToppingDecorator(stickIceCream)

            return stickIceCream
        }
    }
}