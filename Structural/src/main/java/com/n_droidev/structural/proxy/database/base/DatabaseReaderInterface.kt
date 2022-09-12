package com.n_droidev.structural.proxy.database.base

interface DatabaseReaderInterface {
	fun readData(dataReadListener: DatabaseReadDataCallback)
	
	interface DatabaseReadDataCallback {
		fun onDataRead(nameList: List<String>)
		fun onReadingError(e: Exception?)
	}
}