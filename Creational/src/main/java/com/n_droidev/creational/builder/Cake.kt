package com.n_droidev.creational.builder

class Cake(var shape: Shape?, var flavour: Flavour?, var topping: Topping?) {

    enum class Shape {
        CIRCLE, RECTANGLE, TRIANGLE, POLYGON, HEART
    }

    enum class Flavour {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    enum class Topping {
        Cocos, Chocolate, Fruit
    }

    override fun toString(): String {
        return "Shape: " + shape?.toString() + "\nFlavour: " + flavour?.toString() + "\nTopping: " + topping?.toString()
    }

    data class CakeBuilder(var shape: Shape?, var flavour: Flavour?, var topping: Topping?) {

        constructor() : this(null,null,null)

        fun setShape(shape: Shape?) = apply { this.shape = shape }

        fun setFlavour(flavour: Flavour?) = apply { this.flavour = flavour }

        fun setTopping(topping: Topping?) = apply { this.topping = topping }

        fun build(): Cake {
            return Cake(shape, flavour, topping)
        }
    }

}