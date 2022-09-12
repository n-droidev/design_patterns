package com.n_droidev.behavioral.observer.model.goods

import com.n_droidev.behavioral.observer.model.goods.base.BaseGood

class Iphone(var ram: Int, var cpu: String, var battery: Int, name: String, price: Double) : BaseGood(name, price)