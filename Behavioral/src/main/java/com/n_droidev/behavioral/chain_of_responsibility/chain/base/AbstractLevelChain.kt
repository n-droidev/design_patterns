package com.n_droidev.behavioral.chain_of_responsibility.chain.base

abstract class AbstractLevelChain {
	private var nextLevel: AbstractLevelChain? = null
	var levelObjects = arrayListOf<Any>()
	
	fun setUp(level: Int): AbstractLevelChain? {
		println(getLevel().toString())
		if (getLevel() == level) {
			configureLevel()
		} else if (nextLevel != null && getLevel() < level) {
			nextLevel!!.setUp(level)
		} else {
			println("Error")
		}
		return null
	}
	
	fun setNext(nextLevel: AbstractLevelChain):AbstractLevelChain {
		this.nextLevel = nextLevel
		return this
	}
	
	private fun configureLevel() {
		println("Level ${getLevel()} executed")
		levelObjects.add(getObjects())
	}
	
	abstract fun getObjects(): ArrayList<Any>
	
	abstract fun getLevel(): Int
}