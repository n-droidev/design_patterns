package com.n_droidev.structural.decorator.decorator

import com.n_droidev.structural.decorator.decorator.base.BaseIceCreamDecorator
import com.n_droidev.structural.decorator.model.base.IceCream

class RedTopColorDecorator(iceCream: IceCream) :
	BaseIceCreamDecorator(iceCream) {
	override fun getTopColor(): String {
		return "Red"
	}
}