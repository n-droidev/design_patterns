package com.n_droidev.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.n_droidev.ui.databinding.ItemPatternBinding
import com.n_droidev.ui.model.Pattern
import com.n_droidev.ui.model.SimplePatternItem

open class PatternsRecyclerAdapter(
	patterns: List<Pattern>,
	private var simpleItems: ArrayList<Pattern> = arrayListOf(SimplePatternItem("S.O.L.I.D"))
) : RecyclerView.Adapter<PatternsRecyclerAdapter.ViewHolder>() {
	
	lateinit var binding: ItemPatternBinding
	private var itemClickListener: ItemClickListener? = null
	private var allItems = arrayListOf<Pattern>()
	
	private val ITEM_TYPE_SIMPLE = 0
	private val ITEM_TYPE_PATTERN = 1
	
	
	init {
		allItems.addAll(simpleItems)
		allItems.addAll(patterns)
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatternsRecyclerAdapter.ViewHolder {
		val inflater = LayoutInflater.from(parent.context)
		binding = ItemPatternBinding.inflate(inflater, parent, false)
		
		return ViewHolder(binding)
	}
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		val patternName = allItems[position].name
		
		holder.itemBinder.name.text = patternName
		
		holder.itemBinder.name.setOnClickListener {
			if (position < simpleItems.size) {
				patternName?.let { it1 -> itemClickListener?.onSimpleItemClick(it1, position) }
			} else {
				patternName?.let { it1 -> itemClickListener?.onItemClick(it1, position - simpleItems.size) }
			}
		}
	}
	
	fun setOnItemClickListener(itemClickListener: ItemClickListener) {
		this.itemClickListener = itemClickListener
	}
	
	
	override fun getItemViewType(position: Int): Int {
		return if (position < simpleItems.size) {
			ITEM_TYPE_SIMPLE
		} else {
			ITEM_TYPE_PATTERN
		}
	}
	
	
	override fun getItemCount(): Int = allItems.size
	
	
	inner class ViewHolder(val itemBinder: ItemPatternBinding) : RecyclerView.ViewHolder(itemBinder.root)
	
	
	interface ItemClickListener {
		fun onItemClick(patternName: String, pos: Int)
		fun onSimpleItemClick(patternName: String, pos: Int)
	}
}