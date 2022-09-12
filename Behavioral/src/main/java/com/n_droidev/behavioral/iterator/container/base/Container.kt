package com.n_droidev.behavioral.iterator.container.base

import com.n_droidev.behavioral.iterator.iterator.base.Iterator

interface Container {
	fun getIterator():Iterator
}