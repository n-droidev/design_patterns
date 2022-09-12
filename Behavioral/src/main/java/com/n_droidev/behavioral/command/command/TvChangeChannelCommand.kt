package com.n_droidev.behavioral.command.command

import com.n_droidev.behavioral.command.command.base.Command
import com.n_droidev.behavioral.command.model.TV

class TvChangeChannelCommand(
	var tv: TV,
	var directionUp: Boolean
) : Command {
	override fun execute() {
		tv.changeChannel(directionUp)
	}
}