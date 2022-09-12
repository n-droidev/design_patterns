package com.n_droidev.behavioral.template.template

import com.n_droidev.behavioral.template.model.Admin
import com.n_droidev.behavioral.template.template.base.AbstractParser

class JsonParser(data: String) : AbstractParser(data) {
	override fun parseData(): List<Admin> {
		// Parse data from json string
		return arrayListOf(
			Admin("Samir", 24, "K", arrayListOf("DELETE", "WRITE")),
			Admin("Fuad", 22, "K", arrayListOf("READ")),
			Admin("Leyla", 23, "Q", arrayListOf("DELETE", "UPDATE"))
		)
	}
}