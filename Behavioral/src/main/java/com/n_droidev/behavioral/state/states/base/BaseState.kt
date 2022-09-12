package com.n_droidev.behavioral.state.states.base

import com.n_droidev.behavioral.state.context.base.BaseContext

interface BaseState {
	fun changeState(context: BaseContext)
	
	override fun toString(): String
}