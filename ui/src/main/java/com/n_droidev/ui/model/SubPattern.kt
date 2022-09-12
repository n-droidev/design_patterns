package com.n_droidev.designpatterns.ui.model

import com.n_droidev.ui.model.CodeExample
import com.n_droidev.ui.model.Pattern
import com.google.gson.annotations.SerializedName


data class SubPattern(
    @SerializedName("name") override var name: String? = null,
    @SerializedName("code_examples") var codeExamples: ArrayList<CodeExample> = arrayListOf(),
    @SerializedName("desc") var subPatternDescriptions: ArrayList<SubPatternDescription> = arrayListOf()
) : Pattern