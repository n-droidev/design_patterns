package com.n_droidev.behavioral.strategy.strategies

import com.n_droidev.behavioral.strategy.strategies.base.SortingStrategy

class SomeOtherSortingStrategy : SortingStrategy {
	override fun sort(list: List<Any>): List<Any> {
		/// Do some sorting operations (not copied from google :))
		println("Some Other Sorting Strategy called")
		return list
	}
}