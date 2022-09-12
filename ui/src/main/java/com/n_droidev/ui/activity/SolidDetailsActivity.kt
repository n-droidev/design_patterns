package com.n_droidev.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.n_droidev.ui.R
import com.n_droidev.ui.adapter.PatternContentExpandableAdapter
import com.n_droidev.ui.converter.Strings2SubPatternDescriptions
import com.n_droidev.ui.databinding.ActivitySolidDetailsBinding

class SolidDetailsActivity : AppCompatActivity() {
	private lateinit var binding: ActivitySolidDetailsBinding
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySolidDetailsBinding.inflate(layoutInflater)
		setContentView(binding.root)
		setSupportActionBar(binding.toolbar)
		
		val titles = resources.getStringArray(R.array.solid_titles)
		val contents = resources.getStringArray(R.array.solid_contents)
		val convertedList = Strings2SubPatternDescriptions().convert(titles, contents,true)
		
		binding.descriptionExpandableListView.setAdapter(PatternContentExpandableAdapter(this, convertedList))
	}
	
}