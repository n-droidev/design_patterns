package com.n_droidev.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.n_droidev.designpatterns.ui.model.SubPattern
import com.n_droidev.ui.adapter.PatternContentExpandableAdapter
import com.n_droidev.ui.constant.Intent
import com.n_droidev.ui.databinding.ActivitySubPatternDetailsBinding

class SubPatternDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubPatternDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubPatternDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val subPattern: SubPattern = (intent.extras!!.getSerializable(Intent.SUB_PATTERN) as SubPattern?)!!

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = subPattern.name

        binding.viewCodeExamplesBT.setOnClickListener {
            val intent = android.content.Intent(this, CodeExamplesActivity::class.java)
            intent.putExtra(Intent.CODE_EXAMPLES, subPattern.codeExamples)
            intent.putExtra(Intent.PATTERN_NAME, subPattern.name)
            startActivity(intent)
        }


        binding.runExampleBT.setOnClickListener {
            val intent = android.content.Intent(this, RunnableCodeExampleActivity::class.java)
            intent.putExtra(Intent.PATTERN_NAME, subPattern.name)
            startActivity(intent)
        }


        binding.descriptionExpandableListView.setAdapter(PatternContentExpandableAdapter(this, subPattern.subPatternDescriptions))
        for (i in 0 until subPattern.subPatternDescriptions.size)
            binding.descriptionExpandableListView.expandGroup(i, false)

    }

}