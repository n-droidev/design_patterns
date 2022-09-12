package com.n_droidev.behavioral.observer.event.events

import com.n_droidev.behavioral.observer.event.events.base.EventListener

class SMSNotificationListener(var number:String):EventListener {
	override fun update(eventType: EventListener.EventType, data: Any?) {
		// Send sms to users in data
		println("User with number: $number notified via SMS about $eventType" )
	}
}