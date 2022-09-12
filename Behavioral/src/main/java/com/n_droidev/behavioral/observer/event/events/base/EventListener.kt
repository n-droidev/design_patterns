package com.n_droidev.behavioral.observer.event.events.base

interface EventListener {
	enum class EventType {
		ADDED,SOLD_OUT
	}
	
	fun update(eventType: EventType, data: Any?)
}