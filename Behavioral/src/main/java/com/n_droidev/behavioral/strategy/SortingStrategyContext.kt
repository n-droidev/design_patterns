package com.n_droidev.behavioral.strategy

import android.content.Context
import android.widget.Toast
import com.n_droidev.behavioral.strategy.strategies.base.SortingStrategy

class SortingStrategyContext(var context: Context) {
	var strategy: SortingStrategy? = null
	
	fun sort(list: List<Any>): List<Any>? {
		Toast.makeText(
			context, strategy?.toString(),
			Toast.LENGTH_LONG
		).show()
		return strategy?.sort(list)
	}
}