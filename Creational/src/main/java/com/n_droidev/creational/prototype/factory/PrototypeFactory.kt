package com.n_droidev.creational.prototype.factory

import android.graphics.Color
import com.n_droidev.creational.prototype.model.shape.Circle
import com.n_droidev.creational.prototype.model.shape.Polygon
import com.n_droidev.creational.prototype.model.shape.Rectangle
import com.n_droidev.creational.prototype.model.shape.base.Shape

class PrototypeFactory {

    companion object {
        fun getPrototype(name: String): Shape {
            return when (name) {
                "Cirlce" -> Circle(2, 4, Color.CYAN, 23, 14, 54.5).clone()
                "Rectangle" -> Rectangle(1, 5, Color.RED, 6, 3).clone()
                "Polygon" -> Polygon(2, 5, Color.BLUE, 6).clone()
                else -> {
                    Rectangle(1,5,Color.MAGENTA,53,24).clone()
                }
            }
        }
    }

}