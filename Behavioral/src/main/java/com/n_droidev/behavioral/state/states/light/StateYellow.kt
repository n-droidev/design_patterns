package com.n_droidev.behavioral.state.states.light

import com.n_droidev.behavioral.state.context.base.BaseContext
import com.n_droidev.behavioral.state.states.base.BaseState

class StateYellow: BaseState {
	override fun changeState(context: BaseContext) {
		println("Yellow changed to Red")
		context.state= StateRed()
	}
	
	override fun toString(): String {
		return "Yellow"
	}
}