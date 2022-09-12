package com.n_droidev.structural.decorator.decorator

import com.n_droidev.structural.decorator.decorator.base.BaseIceCreamDecorator
import com.n_droidev.structural.decorator.model.base.IceCream

class ChocolateToppingDecorator(iceCream: IceCream) :
	BaseIceCreamDecorator(iceCream) {
	override fun getTopping(): String {
		return "Chocolate"
	}
}