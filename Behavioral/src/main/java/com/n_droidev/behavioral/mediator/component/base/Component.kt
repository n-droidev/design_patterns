package com.n_droidev.behavioral.mediator.component.base

import com.n_droidev.behavioral.mediator.mediator.RoadMediator

abstract class Component {
	var mediator: RoadMediator? = null
		get() = field
		set(value) {
			field = value
		}
}