package com.n_droidev.ui.converter

import com.n_droidev.designpatterns.ui.model.SubPatternDescription

class Strings2SubPatternDescriptions {
	fun convert(titles: Array<String>, contents: Array<String>,simpleItem:Boolean): ArrayList<SubPatternDescription> {
		val contentList = arrayListOf<SubPatternDescription>()
		for (i in titles.indices) {
			contentList.add(SubPatternDescription(titles[i], contents[i], simpleItem))
		}
		return contentList
	}
}