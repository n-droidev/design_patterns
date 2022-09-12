package com.n_droidev.designpatterns.ui.model

import com.n_droidev.ui.model.Pattern
import com.google.gson.annotations.SerializedName


data class DesignPattern(
    @SerializedName("name") override var name: String? = null,
    @SerializedName("types") var types: ArrayList<SubPattern> = arrayListOf()
) : Pattern