package com.n_droidev.designpatterns.ui.model

import com.google.gson.annotations.SerializedName


data class PatternGroups(
    @SerializedName("pattern_groups") var groups: ArrayList<DesignPattern> = arrayListOf()
)