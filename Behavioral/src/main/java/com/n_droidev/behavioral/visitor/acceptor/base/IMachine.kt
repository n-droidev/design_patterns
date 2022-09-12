package com.n_droidev.behavioral.visitor.acceptor.base

interface IMachine {
	fun grind(speed:Int)
	fun stop()
	fun reverse(speed: Int)
}