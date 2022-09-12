package com.n_droidev.behavioral.template

import com.n_droidev.behavioral.template.template.JsonParser
import com.n_droidev.behavioral.template.template.XmlParser

class TemplateExample {
	fun runExample() {
		val jsonParser = JsonParser("[{\"ssfs\":\"gsdf\"},{\"bbbbcbs\":\"twerewf\"}]").getAdminsAsUsers()
		val xmlParser = XmlParser("[{\"gwert43s\":\"g34twerssdf\"},{\"saascbs\":\"erewf\"}]").getAdminsAsUsers()
		for (js in jsonParser) {
			println(js.name)
		}
		for (xml in xmlParser) {
			println(xml.name)
		}
	}
}