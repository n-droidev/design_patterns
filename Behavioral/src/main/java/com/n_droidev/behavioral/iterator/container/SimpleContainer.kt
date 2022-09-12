package com.n_droidev.behavioral.iterator.container

import com.n_droidev.behavioral.iterator.container.base.Container
import com.n_droidev.behavioral.iterator.iterator.SimpleIterator
import com.n_droidev.behavioral.iterator.iterator.base.Iterator

class SimpleContainer(
	private var list:
	ArrayList<Any>
) : Container {
	override fun getIterator(): Iterator {
		return SimpleIterator(list)
	}
}