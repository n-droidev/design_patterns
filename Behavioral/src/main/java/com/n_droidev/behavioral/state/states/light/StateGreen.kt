package com.n_droidev.behavioral.state.states.light

import com.n_droidev.behavioral.state.context.base.BaseContext
import com.n_droidev.behavioral.state.states.base.BaseState

class StateGreen: BaseState {
	override fun changeState(context:BaseContext) {
		println("Green changed to Yellow")
		context.state= StateYellow()
	}
	
	override fun toString(): String {
		return "Green"
	}
}