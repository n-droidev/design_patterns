package com.n_droidev.structural.adapter.model.shape

import com.n_droidev.structural.adapter.model.shape.base.Shape


class Polygon(override var x: Int, override var y: Int, override var color: Int, var side:Int) : Shape {

    override fun clone(): Shape {
        return Polygon(this.x, this.y, this.color,this.side)
    }

    override fun getName(): String {
        return "Polygon"
    }

    override fun draw() {
        println(getName() + " drawn!")
    }
}