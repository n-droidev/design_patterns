package com.n_droidev.ui.adapter

import android.content.Context
import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.n_droidev.designpatterns.ui.model.SubPatternDescription
import com.n_droidev.ui.R


class PatternContentExpandableAdapter(private val context: Context, private val descriptions: ArrayList<SubPatternDescription>) : BaseExpandableListAdapter() {
	
	override fun getChild(listPosition: Int, expandedListPosition: Int): Any? {
		return descriptions[listPosition].content
	}
	
	override fun getChildId(listPosition: Int, expandedListPosition: Int): Long {
		return listPosition.toLong()
	}
	
	override fun getChildView(listPosition: Int, expandedListPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View? {
		var view = convertView
		val childText = getChild(listPosition, expandedListPosition) as String?
		if (view == null) {
			val layoutInflater = LayoutInflater.from(context)
			view = layoutInflater.inflate(R.layout.item_pattern_content, parent, false)
		}
		val expandedListTextView = view?.findViewById<View>(R.id.itemTV) as TextView
		expandedListTextView.text = childText
		return view
	}
	
	override fun getChildrenCount(listPosition: Int): Int {
		return 1
	}
	
	override fun getGroup(listPosition: Int): Any? {
		return descriptions[listPosition].name
	}
	
	override fun getGroupCount(): Int {
		return descriptions.size
	}
	
	override fun getGroupId(listPosition: Int): Long {
		return listPosition.toLong()
	}
	
	override fun getGroupView(listPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View? {
		var view = convertView
		val listTitle = getGroup(listPosition) as String?
		if (view == null) {
			val layoutInflater = LayoutInflater.from(context)
			view = layoutInflater.inflate(R.layout.group_pattern_content, parent, false)
		}
		val listTitleTextView = view?.findViewById<View>(R.id.groupNameTV) as TextView
		if (descriptions[listPosition].typeSimpleItem) {
			val spannable = SpannableString(listTitle)
			spannable.setSpan(ForegroundColorSpan(Color.RED), 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
			listTitleTextView.text = spannable
		} else {
			listTitleTextView.text = listTitle
		}
		return view
	}
	
	override fun hasStableIds(): Boolean {
		return false
	}
	
	override fun isChildSelectable(listPosition: Int, expandedListPosition: Int): Boolean {
		return false
	}
	
}