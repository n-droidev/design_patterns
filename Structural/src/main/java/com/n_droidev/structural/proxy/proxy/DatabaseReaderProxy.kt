package com.n_droidev.structural.proxy.proxy

import com.n_droidev.structural.proxy.database.DatabaseReader
import com.n_droidev.structural.proxy.database.base.DatabaseReaderInterface

class DatabaseReaderProxy(var databaseReader: DatabaseReader) : DatabaseReaderInterface {
	var dataList: List<String>? = null
	
	override fun readData(dataReadListener: DatabaseReaderInterface.DatabaseReadDataCallback) {
		if (dataList == null || dataList!!.isEmpty()) {
			databaseReader.readData(object : DatabaseReaderInterface.DatabaseReadDataCallback {
				override fun onDataRead(nameList: List<String>) {
					dataList = nameList
					dataReadListener.onDataRead(nameList)
				}
				
				override fun onReadingError(e: Exception?) {
					dataReadListener.onReadingError(e)
				}
			})
		} else {
			dataReadListener.onDataRead(dataList!!)
		}
	}
}