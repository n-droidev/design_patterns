package com.n_droidev.structural.composite.model.base

open class CalculableItem(
	private var price: Double?,
	private var count: Int?
) : BaseCalculable {
	constructor() : this(null, null)
	
	override fun getPrice(): Double? {
		return price
	}
	
	override fun getItemCount(): Int? {
		return count
	}
}