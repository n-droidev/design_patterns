package com.n_droidev.structural.bridge.switcher.base

import com.n_droidev.structural.bridge.light.base.Light


interface Switch {
    var light: Light

    fun toggle(): Boolean

    fun setColor(color: Int): Boolean

    fun setBrightness(percent: Int): Boolean
}