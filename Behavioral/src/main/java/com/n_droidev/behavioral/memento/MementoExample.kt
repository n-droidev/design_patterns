package com.n_droidev.behavioral.memento

import android.content.Context
import com.n_droidev.behavioral.memento.model.Image

class MementoExample(var context: Context) {
	fun runExample() {
		val image = Image(
			200, 100, arrayOf(
				arrayOf("#cba", "#5fd", "#a16", "#286"),
				arrayOf("#cba", "#5fd", "#a16", "#286"),
				arrayOf("#cba", "#5fd", "#a16", "#286"),
				arrayOf("#cba", "#5fd", "#a16", "#286")
			)
		)
		
		val backup = image.createBackup()
		image.height = 957
		image.width = 854
		
		println("${image.width}  ${image.height}")
		backup.restore()
		println("${image.width}  ${image.height}")
	}
}