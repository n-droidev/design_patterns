package com.n_droidev.behavioral.command.command

import com.n_droidev.behavioral.command.command.base.Command
import com.n_droidev.behavioral.command.model.Light

class LightChangeBrightnessCommand(
	private var light: Light,
	private var brightnessUp: Boolean
) : Command {
	override fun execute() {
		light.changeBrightness(brightnessUp)
	}
}