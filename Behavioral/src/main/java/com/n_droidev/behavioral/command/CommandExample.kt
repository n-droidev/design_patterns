package com.n_droidev.behavioral.command

import com.n_droidev.behavioral.command.command.LightChangeBrightnessCommand
import com.n_droidev.behavioral.command.command.LightOnCommand
import com.n_droidev.behavioral.command.command.TvChangeChannelCommand
import com.n_droidev.behavioral.command.command.TvOnCommand
import com.n_droidev.behavioral.command.model.Light
import com.n_droidev.behavioral.command.model.TV

class CommandExample {
	fun runExample() {
		val light = Light()
		val tv = TV(15)
		
		TvOnCommand(tv).execute()
		TvChangeChannelCommand(tv, false).execute()
		LightOnCommand(light).execute()
		LightChangeBrightnessCommand(light, false).execute()
		LightChangeBrightnessCommand(light, false).execute()
		LightChangeBrightnessCommand(light, false).execute()
	}
}