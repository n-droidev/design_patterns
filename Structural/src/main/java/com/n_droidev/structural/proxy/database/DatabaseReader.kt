package com.n_droidev.structural.proxy.database

import android.os.Handler
import android.os.Looper
import com.n_droidev.structural.proxy.database.base.DatabaseReaderInterface

class DatabaseReader : DatabaseReaderInterface {
	override fun readData(dataReadListener: DatabaseReaderInterface.DatabaseReadDataCallback) {
		Handler(Looper.myLooper()!!).postDelayed({
			dataReadListener.onDataRead(listOf("Samir","Fuad","Orxan","Hamida","Aysel","Rena"))
		}, 3000)
	}
}