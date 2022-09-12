package com.n_droidev.creational.singleton.java_style

class Retrofit {


    init {
        println("Retrofit singleton class initialized! (java style)")
    }

    companion object {

        private var mInstance: Retrofit? = null

        fun getInstance(): Retrofit {
            if (mInstance == null) {
                synchronized(this) {
                    if (mInstance == null) {
                        mInstance = Retrofit()
                        return mInstance as Retrofit
                    }
                }
            }
            return mInstance!!
        }

    }


    fun makeApiRequest(){
        println("Api request sent! (java style)")
    }

}