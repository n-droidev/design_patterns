package com.n_droidev.ui.activity.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.n_droidev.ui.adapter.PatternsRecyclerAdapter
import com.n_droidev.ui.databinding.ActivityPatternCategoryBaseBinding

open class PatternCategoryBaseActivity() : AppCompatActivity(),
	PatternsRecyclerAdapter.ItemClickListener {
	
	lateinit var binding: ActivityPatternCategoryBaseBinding
	
	
	fun setUpView() {
		setContentView(binding.root)
		setSupportActionBar(binding.toolbar)
	}
	
	fun initBinding() {
		binding = ActivityPatternCategoryBaseBinding.inflate(layoutInflater)
	}
	
	fun setAdapter(adapter: PatternsRecyclerAdapter) {
		binding.patternsRecycler.adapter = adapter
		
		binding.patternsRecycler.adapter.let {
			(it as PatternsRecyclerAdapter?)?.setOnItemClickListener(this)
		}
		
		binding.patternsRecycler.addItemDecoration(
			DividerItemDecoration(
				this,
				DividerItemDecoration.VERTICAL
			)
		)
	}
	
	fun setTitle(title: String) {
		supportActionBar?.title = title
	}
	
	override fun onItemClick(patternName: String, pos: Int) {
		Toast.makeText(this, "Item clicked: $pos", Toast.LENGTH_SHORT).show()
	}
	
	override fun onSimpleItemClick(patternName: String, pos: Int) {
		Toast.makeText(this, "Item clicked: $pos", Toast.LENGTH_SHORT).show()
	}
	
}