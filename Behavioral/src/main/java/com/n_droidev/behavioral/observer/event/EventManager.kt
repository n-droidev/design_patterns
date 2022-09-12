package com.n_droidev.behavioral.observer.event

import com.n_droidev.behavioral.observer.event.events.base.EventListener

class EventManager {
	private var listeners: MutableList<Pair<EventListener.EventType, EventListener>> = mutableListOf()
	
	fun notify(eventType: EventListener.EventType, data: Any?) {
		val events: List<EventListener> = listeners.filter { it.first == eventType }.map { it.second }
		for (event in events) {
			event.update(eventType, data)
		}
	}
	
	fun subscribe(eventType: EventListener.EventType, listener: EventListener) {
		listeners.add(eventType to listener)
	}
	
	fun unsubscribe(eventType: EventListener.EventType) {
		listeners.removeAt(listeners.indexOfFirst { it.first == eventType })
	}
}