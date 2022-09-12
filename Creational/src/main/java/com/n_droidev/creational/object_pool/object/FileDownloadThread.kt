package com.n_droidev.creational.object_pool.`object`

import android.os.Handler

class FileDownloadThread(var url: String) : Thread() {

    private var handler: Handler? = null


    fun startThread() {
        Runnable {
            println("File Downloading started!")

            var progress = 1
            while (progress < 100) {
                sleep(50)
                println("$progress% downloaded")
                progress += 5
            }
            handler?.sendEmptyMessage(1)
        }.run()
    }


    fun setHandler(handler: Handler) {
        this.handler = handler
    }

}