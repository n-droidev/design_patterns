package com.n_droidev.creational.prototype.model.shape

import com.n_droidev.creational.prototype.model.shape.base.Shape

class Rectangle(override var x: Int, override var y: Int, override var color: Int, var width: Int, var height: Int) : Shape {

    override fun clone(): Shape {
        return Rectangle(this.x, this.y, this.color, this.width, this.height)
    }

    override fun getName(): String {
        return "Rectangle"
    }

    override fun draw() {
        println(getName() + " drawn!")
    }
}