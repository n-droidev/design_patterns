package com.n_droidev.structural.facade.sub_systems

import android.content.Context
import java.io.InputStream


class VideoFileRecorder(private var context: Context) {
    fun recordeVideo(): InputStream {
        //.......
        val dummyInput: InputStream = context.assets.open("demo.mp4")
        return dummyInput
    }
}