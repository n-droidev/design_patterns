package com.n_droidev.behavioral.template.template

import com.n_droidev.behavioral.template.model.Admin
import com.n_droidev.behavioral.template.template.base.AbstractParser

class XmlParser(data: String) : AbstractParser(data) {
	override fun parseData(): List<Admin> {
		// Parse data from xml string
		return arrayListOf(
			Admin("Orxan", 24, "K", arrayListOf("DELETE", "WRITE")),
			Admin("Bilal", 22, "K", arrayListOf("READ")),
			Admin("Aysel", 23, "Q", arrayListOf("DELETE", "UPDATE"))
		)
	}
}