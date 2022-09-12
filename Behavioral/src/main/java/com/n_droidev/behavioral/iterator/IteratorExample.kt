package com.n_droidev.behavioral.iterator

import android.content.Context
import com.n_droidev.behavioral.iterator.container.SimpleContainer

class IteratorExample(var context: Context) {
	fun runExample() {
		val list = arrayListOf<Any>("Str 1", 325, 35.64, "Str 2", true, false)
		val iterator = SimpleContainer(list).getIterator()
		val example: StringBuilder = StringBuilder()
		while (iterator.hasNext()) {
			example.append(iterator.next().toString()).append("   ")
		}
		println(example)
	}
}