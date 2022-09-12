package com.n_droidev.behavioral.state.context.base

import com.n_droidev.behavioral.state.states.base.BaseState

abstract class BaseContext(var state: BaseState) {
	abstract fun canPass(): Boolean
}