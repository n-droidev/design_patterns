package com.n_droidev.behavioral.chain_of_responsibility

import com.n_droidev.behavioral.chain_of_responsibility.chain.Level1Chain
import com.n_droidev.behavioral.chain_of_responsibility.chain.Level2Chain
import com.n_droidev.behavioral.chain_of_responsibility.chain.Level3Chain
import com.n_droidev.behavioral.chain_of_responsibility.chain.base.AbstractLevelChain

class ChainExample {
	fun getLevelChain(level: Int) {
		val chain: AbstractLevelChain =
			Level1Chain().setNext(
				Level2Chain().setNext(
					Level3Chain()
				)
			)
		chain.setUp(level)
	}
}