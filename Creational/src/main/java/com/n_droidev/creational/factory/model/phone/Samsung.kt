package com.n_droidev.creational.factory.model.phone

import com.n_droidev.creational.factory.model.phone.base.Phone

class Samsung: Phone {

    override fun getModelName(): String {
        return "Samsung"
    }

}