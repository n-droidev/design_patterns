package com.n_droidev.creational.factory.model.phone

import com.n_droidev.creational.factory.model.phone.base.Phone

class Iphone: Phone {
    override fun getModelName(): String {
        return "Iphone"
    }
}