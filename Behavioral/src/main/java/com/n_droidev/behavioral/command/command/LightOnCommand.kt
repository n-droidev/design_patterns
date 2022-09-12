package com.n_droidev.behavioral.command.command

import com.n_droidev.behavioral.command.command.base.Command
import com.n_droidev.behavioral.command.model.Light

class LightOnCommand(var light: Light) : Command {
	override fun execute() {
		light.turnOn()
	}
}