package com.n_droidev.structural.composite

import com.n_droidev.structural.composite.factory.OrderCreator
import com.n_droidev.structural.composite.model.CompoundBox
import com.n_droidev.structural.composite.model.Good

class CompositeTester {
    companion object{
        fun getOrderCreator():OrderCreator{
            val orderCreator=OrderCreator()
            val box1= CompoundBox()
            box1.addItem(Good(5.5,4))
            box1.addItem(Good(10.0,2))
            box1.addItem(Good(5.0,1))
            box1.addItem(Good(15.0,2))
            val good1= Good(10.0,2)
            val good2= Good(15.0,2)
            
            val box2= CompoundBox()
            box2.addItem(Good(1.0,5))
            box2.addItem(Good(2.5,4))
            box2.addItem(box1)
            
            orderCreator.addItem(box1)
            orderCreator.addItem(good1)
            orderCreator.addItem(good2)
            orderCreator.addItem(box2)
            return orderCreator
        }
    }
}