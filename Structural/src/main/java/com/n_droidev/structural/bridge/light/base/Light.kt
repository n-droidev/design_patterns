package com.n_droidev.structural.bridge.light.base

interface Light {
    fun toggle(): Boolean
    fun isOn(): Boolean
    fun isColorSupported():Boolean
    fun changeColor(color:Int):Boolean
    fun isBrightnessSupported():Boolean
    fun changeBrightness(percent:Int):Boolean
}