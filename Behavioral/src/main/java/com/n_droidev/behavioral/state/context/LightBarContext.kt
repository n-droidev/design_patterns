package com.n_droidev.behavioral.state.context

import com.n_droidev.behavioral.state.context.base.BaseContext
import com.n_droidev.behavioral.state.states.base.BaseState
import com.n_droidev.behavioral.state.states.light.StateGreen
import com.n_droidev.behavioral.state.states.light.StateRed
import com.n_droidev.behavioral.state.states.light.StateYellow

class LightBarContext(state: BaseState) : BaseContext(state) {
	override fun canPass(): Boolean {
		return when (state) {
			is StateRed -> {
				false
			}
			is StateGreen -> {
				true
			}
			is StateYellow -> {
				false
			}
			else -> {
				false
			}
		}
	}
}