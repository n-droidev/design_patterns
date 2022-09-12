package com.n_droidev.creational.factory.factory

import com.n_droidev.creational.factory.model.phone.Iphone
import com.n_droidev.creational.factory.model.phone.Samsung
import com.n_droidev.creational.factory.model.phone.base.Phone


class PhoneFactory {

    enum class PhoneModel {
        IPHONE, SAMSUNG
    }

    companion object {
        fun makePhone(model: PhoneModel): Phone {
            return when (model) {
                PhoneModel.SAMSUNG -> Samsung()
                PhoneModel.IPHONE -> Iphone()
            }
        }
    }

}