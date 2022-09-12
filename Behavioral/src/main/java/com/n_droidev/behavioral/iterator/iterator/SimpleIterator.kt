package com.n_droidev.behavioral.iterator.iterator

import com.n_droidev.behavioral.iterator.iterator.base.Iterator

class SimpleIterator(var list: ArrayList<Any>) : Iterator {
	var index: Int = 0
	
	override fun hasNext(): Boolean {
		return index < list.size
	}
	
	override fun next(): Any? {
		return if (hasNext()) {
			list[index++]
		} else {
			null
		}
	}
}