package com.n_droidev.structural.adapter.model.shape.base

interface Shape : Cloneable {
    var x:Int
    var y:Int
    var color:Int

    public override fun clone(): Shape

    fun getName(): String

    fun draw()
}