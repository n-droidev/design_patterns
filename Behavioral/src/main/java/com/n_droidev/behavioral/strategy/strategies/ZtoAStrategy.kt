package com.n_droidev.behavioral.strategy.strategies

import com.n_droidev.behavioral.strategy.strategies.base.SortingStrategy

class ZtoAStrategy : SortingStrategy {
	override fun sort(list: List<Any>): List<Any> {
		val mutableList:MutableList<String> = mutableListOf(list)
				as MutableList<String>
		mutableList.sortDescending()
		println("Z to A Sorting Strategy called")
		return mutableList
	}
}