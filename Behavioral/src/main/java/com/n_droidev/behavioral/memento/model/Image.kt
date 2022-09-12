package com.n_droidev.behavioral.memento.model

class Image(
	var width: Int,
	var height: Int,
	var pixels: Array<Array<String>>
) {
	fun createBackup(): ImageSnapshot {
		return ImageSnapshot(
			this, width, height, pixels
		)
	}
}