package com.n_droidev.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.n_droidev.ui.adapter.CodeExamplesFragmentAdapter
import com.n_droidev.ui.constant.Intent
import com.n_droidev.ui.databinding.ActivityCodeExamplesBinding
import com.n_droidev.ui.model.CodeExample
import com.google.android.material.tabs.TabLayout

class CodeExamplesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCodeExamplesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCodeExamplesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val codeExamples: ArrayList<CodeExample> = intent.getSerializableExtra(Intent.CODE_EXAMPLES) as ArrayList<CodeExample>
        val patternName: String = intent.getStringExtra(Intent.PATTERN_NAME)?:"Unknow Pattern"

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = patternName

        val codeExamplesFragmentAdapter = CodeExamplesFragmentAdapter(supportFragmentManager, codeExamples)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = codeExamplesFragmentAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

    }

}