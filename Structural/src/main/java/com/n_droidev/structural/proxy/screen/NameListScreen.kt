package com.n_droidev.structural.proxy.screen

import com.n_droidev.structural.proxy.database.DatabaseReader
import com.n_droidev.structural.proxy.database.base.DatabaseReaderInterface
import com.n_droidev.structural.proxy.proxy.DatabaseReaderProxy

class NameListScreen {
	fun showNameListToUser() {
		DatabaseReaderProxy(DatabaseReader()).readData(object :
			DatabaseReaderInterface.DatabaseReadDataCallback {
			override fun onDataRead(nameList: List<String>) {
				println("Name List: ${nameList.size}")
				// show name list to user......
			}
			
			override fun onReadingError(e: Exception?) {
				e?.printStackTrace()
			}
		})
	}
}