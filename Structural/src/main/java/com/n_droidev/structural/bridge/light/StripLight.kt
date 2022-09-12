package com.n_droidev.structural.bridge.light

import com.n_droidev.structural.bridge.light.base.BaseLight

class StripLight() : BaseLight() {

    override fun isColorSupported(): Boolean {
        return true
    }


    override fun isBrightnessSupported(): Boolean {
        return true
    }

}