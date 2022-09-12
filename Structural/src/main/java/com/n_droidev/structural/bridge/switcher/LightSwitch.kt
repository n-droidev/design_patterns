package com.n_droidev.structural.bridge.switcher

import com.n_droidev.structural.bridge.light.base.Light
import com.n_droidev.structural.bridge.switcher.base.Switch

class LightSwitch(override var light: Light):Switch {

    override fun toggle(): Boolean {
        return light.toggle()
    }

    override fun setColor(color:Int): Boolean {
        return light.changeColor(color)
    }

    override fun setBrightness(percent:Int): Boolean {
        return light.changeBrightness(percent)
    }
}