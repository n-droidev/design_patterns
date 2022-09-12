package com.n_droidev.creational.singleton.kotlin_style

object Retrofit {

    init {
        println("Retrofit singleton class initialized! (kotlin style)")
    }

    fun makeApiRequest(){
        println("Api request sent! (kotlin style)")
    }

}