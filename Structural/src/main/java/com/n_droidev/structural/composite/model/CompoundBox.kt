package com.n_droidev.structural.composite.model

import android.util.Log
import com.n_droidev.structural.composite.model.base.CalculableItem

class CompoundBox : CalculableItem() {
    var items = arrayListOf<CalculableItem>()

    fun addItem(item: CalculableItem) {
        items.add(item)
    }

    override fun getPrice(): Double {
        var totalPrice =0.0
        for (item in items) {
            totalPrice+=item.getPrice()?:0.0
            Log.e("tag",""+totalPrice)
        }
        return totalPrice
    }

    override fun getItemCount(): Int {
        var count = 0
        for (item in items) {
            count += item.getItemCount() ?: 0
        }
        return count
    }
}