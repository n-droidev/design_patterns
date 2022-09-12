package com.n_droidev.creational.object_pool.pool.base

abstract class ObjectPool {
    private val expirationTime: Long = 20000
    private val locked: HashMap<Any, Long> = hashMapOf()
    private val unlocked: HashMap<Any, Long> = hashMapOf()
    
    abstract fun create(): Any
    abstract fun kill(t: Any)
    abstract fun validate(t: Any): Boolean
    
    open fun getExpirationTime(): Long {
        return expirationTime
    }

    @Synchronized
    fun take(): Any {
        val timeNow = System.currentTimeMillis()

        if (unlocked.size > 0) {
            for (tKey in unlocked.keys) {
                if (timeNow - unlocked[tKey]!! < getExpirationTime() && validate(tKey)) {
                    unlocked.remove(tKey)
                    locked[tKey] = timeNow
                    println("Object taken $tKey")
                    return tKey
                } else {
                    unlocked.remove(tKey)
                    kill(tKey)
                    println("Object expired and removed $tKey")
                }
            }
        }
        val t: Any = create()
        locked[t] = timeNow
        println("Object not available and created $t")
        return t
    }
    
    @Synchronized
    fun release(t: Any) {
        locked.remove(t)
        unlocked[t] = System.currentTimeMillis()
        println("Object released $t")
    }
}