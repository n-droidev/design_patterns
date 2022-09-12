package com.n_droidev.behavioral.observer

import android.os.Handler
import android.os.Looper
import android.util.Log
import com.n_droidev.behavioral.observer.event.EventManager
import com.n_droidev.behavioral.observer.event.events.base.EventListener
import com.n_droidev.behavioral.observer.model.goods.AppleWatch
import com.n_droidev.behavioral.observer.model.goods.Iphone
import com.n_droidev.behavioral.observer.model.goods.base.BaseGood

object ObserverExample {
	fun runExample() {
		val eventManager = EventManager()
		
		eventManager.subscribe(EventListener.EventType.ADDED, object : EventListener {
			override fun update(eventType: EventListener.EventType, data: Any?) {
				val good = data as BaseGood
				println("${good.name}  ${good.price}usd - Added again")
				Log.e("Subscription", data.toString())
			}
		})
		
		eventManager.subscribe(EventListener.EventType.SOLD_OUT, object : EventListener {
			override fun update(eventType: EventListener.EventType, data: Any?) {
				val good = data as BaseGood
				println("${good.name}  ${good.price}usd - Sold out")
			}
		})
		
		Handler(Looper.getMainLooper()).postDelayed({
			eventManager.notify(
				EventListener.EventType.ADDED,
				Iphone(4, "Snapdragon 855", 2400, "iphone 8", 540.0)
			)
			Handler(Looper.getMainLooper()).postDelayed({
				eventManager.notify(
					EventListener.EventType.ADDED,
					AppleWatch(300, "iWatch 4", 240.5)
				)
				Handler(Looper.getMainLooper()).postDelayed({
					eventManager.notify(
						EventListener.EventType.SOLD_OUT,
						Iphone(2, "Snapdragon 720", 2150, "iphone 6 plus", 365.0)
					)
				}, 2000)
			}, 2000)
		}, 2000)
		
	}
}