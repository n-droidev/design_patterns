package com.n_droidev.designpatterns.ui.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


open class SubPatternDescription(
	@SerializedName("name") var name: String? = null,
	@SerializedName("content") var content: String? = null,
	var typeSimpleItem: Boolean = false
) : Serializable