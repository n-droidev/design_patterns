package com.n_droidev.creational.prototype.model.shape

import com.n_droidev.creational.prototype.model.shape.base.Shape

class Circle(override var x: Int, override var y: Int, override var color: Int, var width: Int, var height: Int, var radius: Double) : Shape {

    override fun clone(): Shape {
        return Circle(this.x, this.y, this.width, this.height, this.color, this.radius)
    }

    override fun getName(): String {
        return "Circle"
    }

    override fun draw() {
        println(getName() + " drawn!")
    }

}