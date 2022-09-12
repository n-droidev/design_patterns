package com.n_droidev.structural.decorator.decorator.base

import com.n_droidev.structural.decorator.model.base.IceCream

open class BaseIceCreamDecorator(var iceCream: IceCream) : IceCream {
	override fun getBase(): String {
		return iceCream.getBase()
	}
	
	override fun getTopFlavor(): String {
		return iceCream.getTopFlavor()
	}
	
	override fun getTopColor(): String {
		return iceCream.getTopColor()
	}
	
	override fun getTopping(): String {
		return iceCream.getTopping()
	}
}