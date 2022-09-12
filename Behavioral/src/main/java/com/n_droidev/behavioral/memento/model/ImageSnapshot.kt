package com.n_droidev.behavioral.memento.model

class ImageSnapshot(
	var image: Image,
	var width: Int,
	var height: Int,
	var pixels: Array<Array<String>>
) {
	fun restore(): Image {
		image.width = width
		image.height = height
		image.pixels = pixels
		return image
	}
}