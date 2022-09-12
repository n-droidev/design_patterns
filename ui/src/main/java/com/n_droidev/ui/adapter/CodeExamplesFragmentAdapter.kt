package com.n_droidev.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.n_droidev.ui.fragment.SyntaxViewFragment
import com.n_droidev.ui.model.CodeExample


class CodeExamplesFragmentAdapter(fm: FragmentManager, private var codeExamples: ArrayList<CodeExample>) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return SyntaxViewFragment.newInstance(codeExamples[position].example?:"Null Example")
    }

    override fun getPageTitle(position: Int): CharSequence {
        return codeExamples[position].language ?: "Unknown"
    }

    override fun getCount(): Int {
        return codeExamples.size
    }

}