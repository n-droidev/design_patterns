package com.n_droidev.designpatterns.activity.main

import android.content.Intent
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.n_droidev.designpatterns.R
import com.n_droidev.designpatterns.ui.model.PatternGroups
import com.n_droidev.ui.activity.SolidDetailsActivity
import com.n_droidev.ui.activity.SubPatternListActivity
import com.n_droidev.ui.activity.base.PatternCategoryBaseActivity
import com.n_droidev.ui.adapter.PatternsRecyclerAdapter
import com.n_droidev.ui.constant.Intent.PATTERN_NAME
import com.n_droidev.ui.constant.Intent.SUB_PATTERNS
import com.google.gson.Gson
import java.io.InputStreamReader
import java.util.*

class MainActivity : PatternCategoryBaseActivity() {
	private var patternGroups: PatternGroups? = null
	
	override fun onCreate(savedInstanceState: Bundle?) {
		installSplashScreen()
		super.onCreate(savedInstanceState)
		
		initBinding()
		setUpView()
		setTitle(getString(R.string.app_name))
		patternGroups = getPatternsFromJson()
		if (patternGroups == null)
			return
		setAdapter(PatternsRecyclerAdapter(patternGroups!!.groups))
	}
	
	
	private fun getPatternsFromJson(): PatternGroups? {
		return Gson().fromJson(getPatternsJson(), PatternGroups::class.java)
	}
	
	
	private fun getPatternsJson(): String {
		val input = InputStreamReader(assets.open(getPatternFileName()))
		return input.readText()
	}
	
	
	private fun getPatternFileName(): String {
		val local = Locale.getDefault().language
		return "patterns_$local.json"
	}
	
	
	override fun onItemClick(patternName: String, pos: Int) {
		val intent = Intent(this, SubPatternListActivity::class.java)
		intent.putExtra(SUB_PATTERNS, patternGroups!!.groups[pos].types)
		intent.putExtra(PATTERN_NAME, patternGroups!!.groups[pos].name)
		startActivity(intent)
	}
	
	override fun onSimpleItemClick(patternName: String, pos: Int) {
		startActivity(Intent(this@MainActivity, SolidDetailsActivity::class.java))
	}
	
}