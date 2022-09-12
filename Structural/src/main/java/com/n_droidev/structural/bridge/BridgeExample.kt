package com.n_droidev.structural.bridge

import android.content.Context
import android.graphics.Color
import android.widget.Toast
import com.n_droidev.structural.bridge.light.StripLight
import com.n_droidev.structural.bridge.switcher.LightSwitch
import com.n_droidev.structural.bridge.switcher.base.Switch

class BridgeExample {

    fun turnOnRedStripLight(context: Context):Switch {
        val strip = StripLight()
        val sw: Switch = LightSwitch(strip)
        sw.setBrightness(65)
        sw.setColor(Color.RED)
        sw.toggle()
        Toast.makeText(context, "Turned on: ${strip.isOn()}    Color: " +
                "${strip.color}   Brightness: ${strip.brightness}", Toast.LENGTH_LONG).show()
        return sw
    }

}