package com.n_droidev.behavioral.visitor.acceptor

import com.n_droidev.behavioral.visitor.acceptor.base.IMachine

class GrinderMachine : IMachine {
	override fun grind(speed: Int) {
		println("Grinder is grinding with speed: $speed")
	}
	
	override fun stop() {
		println("Grinder stopped")
	}
	
	override fun reverse(speed: Int) {
		println("Grinder reversed with speed: $speed")
	}
}