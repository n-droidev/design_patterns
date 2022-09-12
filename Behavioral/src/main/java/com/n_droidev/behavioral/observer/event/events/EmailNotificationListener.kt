package com.n_droidev.behavioral.observer.event.events

import com.n_droidev.behavioral.observer.event.events.base.EventListener

class EmailNotificationListener(var email: String) : EventListener {
	override fun update(eventType: EventListener.EventType, data: Any?) {
		/// Send email to users in data
		println("User with number: $email notified via email about $eventType")
	}
}