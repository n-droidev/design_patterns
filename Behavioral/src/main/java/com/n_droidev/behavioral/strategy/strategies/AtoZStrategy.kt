package com.n_droidev.behavioral.strategy.strategies

import com.n_droidev.behavioral.strategy.strategies.base.SortingStrategy

class AtoZStrategy : SortingStrategy {
	override fun sort(list: List<Any>): List<Any> {
		val mutableList:MutableList<String> = mutableListOf(list)
				as MutableList<String>
		mutableList.sort()
		println("A to Z Sorting Strategy called")
		return mutableList
	}
}