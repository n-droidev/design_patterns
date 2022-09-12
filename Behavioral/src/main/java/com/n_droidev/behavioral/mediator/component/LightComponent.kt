package com.n_droidev.behavioral.mediator.component

import android.os.Handler
import android.os.Looper
import com.n_droidev.behavioral.mediator.component.base.Component

class LightComponent : Component() {
	init {
		changeLight()
	}
	
	private fun changeLight() {
		Handler(Looper.getMainLooper()).postDelayed({
			mediator?.changeLight()
			changeLight()
		}, 5000)
	}
}