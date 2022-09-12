package com.n_droidev.creational.object_pool.pool

import android.os.Handler
import android.os.Looper
import com.n_droidev.creational.object_pool.`object`.FileDownloadThread
import com.n_droidev.creational.object_pool.pool.base.ObjectPool

object DownloadThreadPool : ObjectPool() {
	
	override fun getExpirationTime(): Long {
		return 10000
	}
	
	override fun create(): Any {
		val thread = FileDownloadThread("https://www.google.com/fsdgsdgs.jpg")
		thread.setHandler(
			Handler(Looper.myLooper()!!, Handler.Callback {
				release(thread)
				return@Callback true
			})
		)
		
		return thread
	}
	
	override fun kill(t: Any) {
		if (t is Thread) {
			t.interrupt()
			t.stop()
		}
	}
	
	override fun validate(t: Any): Boolean {
		if (t is Thread) {
			println("Object validation: ${t.isAlive}")
			return t.isAlive
		}
		return false
	}
	
}