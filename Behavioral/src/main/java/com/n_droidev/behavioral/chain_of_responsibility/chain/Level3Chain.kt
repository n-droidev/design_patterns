package com.n_droidev.behavioral.chain_of_responsibility.chain

import com.n_droidev.behavioral.chain_of_responsibility.chain.base.AbstractLevelChain

class Level3Chain: AbstractLevelChain() {
	override fun getObjects(): ArrayList<Any> {
		return arrayListOf(463453,"sfsg","gref",
			323453,"befdgd",323425.34)
	}
	
	override fun getLevel(): Int {
		return 3
	}
}