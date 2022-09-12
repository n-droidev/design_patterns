package com.n_droidev.behavioral.chain_of_responsibility.chain

import com.n_droidev.behavioral.chain_of_responsibility.chain.base.AbstractLevelChain

class Level1Chain: AbstractLevelChain() {
	override fun getObjects(): ArrayList<Any> {
		return arrayListOf(4,"sfsg",353,"befd",325.34)
	}
	
	override fun getLevel(): Int {
		return 1
	}
}