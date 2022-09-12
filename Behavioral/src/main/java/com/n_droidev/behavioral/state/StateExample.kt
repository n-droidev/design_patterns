package com.n_droidev.behavioral.state

import com.n_droidev.behavioral.state.context.LightBarContext
import com.n_droidev.behavioral.state.context.base.BaseContext
import com.n_droidev.behavioral.state.states.base.BaseState
import com.n_droidev.behavioral.state.states.light.StateYellow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object StateExample {
	fun runExample() {
		val lightState: BaseState = StateYellow()
		val bar: BaseContext = LightBarContext(lightState)
		
		CoroutineScope(Dispatchers.Default).launch {
			for (i in 1..4) {
				bar.state.changeState(bar)
				if (bar.canPass()) {
					println("You can pass...")
				} else {
					println("Cant pass!")
				}
				delay(1000)
			}
		}
	}
}