package com.n_droidev.structural.bridge.light.base

import android.graphics.Color

open class BaseLight() : Light {
	private var turnedOn = false
	open var brightness: Int = 100
	open var color: Int = Color.WHITE
	
	override fun toggle(): Boolean {
		turnedOn = !turnedOn
		return turnedOn
	}
	
	override fun isOn(): Boolean {
		return turnedOn
	}
	
	override fun isColorSupported(): Boolean {
		return false
	}
	
	override fun changeColor(color: Int): Boolean {
		if (!isColorSupported())
			return false
		this.color = color
		return true
	}
	
	override fun isBrightnessSupported(): Boolean {
		return false
	}
	
	override fun changeBrightness(percent: Int): Boolean {
		if (!isBrightnessSupported()) {
			return false
		} else if (percent == 0) {
			turnedOn = false
		} else if (percent < 0) {
			return false
		} else if (percent >= 100) {
			brightness = 100
		} else {
			brightness = percent
		}
		return true
	}
}