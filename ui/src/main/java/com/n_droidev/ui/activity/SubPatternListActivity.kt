package com.n_droidev.ui.activity

import android.os.Bundle
import com.n_droidev.designpatterns.ui.model.SubPattern
import com.n_droidev.ui.activity.base.PatternCategoryBaseActivity
import com.n_droidev.ui.adapter.PatternsRecyclerAdapter
import com.n_droidev.ui.constant.Intent

class SubPatternListActivity : PatternCategoryBaseActivity() {
	private var subPatternList: List<SubPattern> = ArrayList()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		initBinding()
		subPatternList = intent.extras!!.getSerializable(Intent.SUB_PATTERNS) as ArrayList<SubPattern>
		val patternName: String = intent.extras!!.getString(Intent.PATTERN_NAME)!!
		
		setUpView()
		setTitle(patternName)
		setAdapter(PatternsRecyclerAdapter(subPatternList, arrayListOf()))
	}
	
	override fun onItemClick(patternName: String, pos: Int) {
		val intent = android.content.Intent(this, SubPatternDetailsActivity::class.java)
//        intent.putExtra(Intent.PATTERN_POSITION,subPatternList[pos])
//        intent.putExtra(Intent.SUB_PATTERN_POSITION,pos)
		intent.putExtra(Intent.SUB_PATTERN, subPatternList[pos])
		startActivity(intent)
	}
}