package com.n_droidev.structural.bridge.light

import android.graphics.Color
import com.n_droidev.structural.bridge.light.base.BaseLight

class LedLight() : BaseLight() {

    override var color = Color.WHITE

    override fun isColorSupported(): Boolean {
        return false
    }

    override fun changeColor(color: Int): Boolean {
        return false
    }

    override fun isBrightnessSupported(): Boolean {
        return true
    }

}