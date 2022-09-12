package com.n_droidev.behavioral.chain_of_responsibility.chain

import com.n_droidev.behavioral.chain_of_responsibility.chain.base.AbstractLevelChain

class Level2Chain: AbstractLevelChain() {
	override fun getObjects(): ArrayList<Any> {
		return arrayListOf(423,"sfsdfsg","gsdf",325,
			63453,62,5363,543,3253,"bsdgsdefd",325.34)
	}
	
	override fun getLevel(): Int {
		return 2
	}
}