package com.n_droidev.behavioral.state.states.light

import com.n_droidev.behavioral.state.context.base.BaseContext
import com.n_droidev.behavioral.state.states.base.BaseState

class StateRed: BaseState {
	override fun changeState(context: BaseContext) {
		println("Red changed to Green")
		context.state= StateGreen()
	}
	
	override fun toString(): String {
		return "Red"
	}
}