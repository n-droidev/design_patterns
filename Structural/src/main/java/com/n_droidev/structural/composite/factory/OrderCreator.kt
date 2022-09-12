package com.n_droidev.structural.composite.factory

import android.util.Log
import com.n_droidev.structural.composite.model.base.CalculableItem

class OrderCreator() {
    var orderList = arrayListOf<CalculableItem>()

    fun addItem(item: CalculableItem) {
        orderList.add(item)
    }

    fun getCount(): Int {
        var count = 0
        for (item in orderList) {
            count += item.getItemCount() ?: 0
        }
        return count
    }

    fun getPrice(): Double {
        var totalPrice =0.0
        for (item in orderList) {
            totalPrice+=item.getPrice()?:0.0
            Log.e("tag",""+totalPrice)
        }
        return totalPrice
    }

}