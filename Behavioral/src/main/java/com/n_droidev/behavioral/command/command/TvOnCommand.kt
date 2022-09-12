package com.n_droidev.behavioral.command.command

import com.n_droidev.behavioral.command.command.base.Command
import com.n_droidev.behavioral.command.model.TV

class TvOnCommand(var tv: TV) : Command {
	override fun execute() {
		tv.turnOn()
	}
}