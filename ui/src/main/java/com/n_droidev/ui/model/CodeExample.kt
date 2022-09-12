package com.n_droidev.ui.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CodeExample(
    @SerializedName("language") var language: String? = null,
    @SerializedName("example") var example: String? = null
):Serializable