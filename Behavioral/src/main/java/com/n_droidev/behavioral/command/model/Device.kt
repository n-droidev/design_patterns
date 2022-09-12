package com.n_droidev.behavioral.command.model

abstract class Device() {
	private var turnedOn = false
	
	open fun turnOn() {
		turnedOn = true
	}
	
	fun turnOff() {
		turnedOn = false
	}
	
	fun isTurnedOn(): Boolean {
		return turnedOn
	}
}