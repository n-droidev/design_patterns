package com.n_droidev.structural.facade.facade

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.n_droidev.structural.facade.sub_systems.FileSaver
import com.n_droidev.structural.facade.sub_systems.PermissionRequester
import com.n_droidev.structural.facade.sub_systems.PermissionRequester.PermissionCallback
import com.n_droidev.structural.facade.sub_systems.VideoFileRecorder
import java.text.SimpleDateFormat
import java.util.*

class VideoRecorderFacade(private var context: Context) {
    
    fun recordeVideo() {
        getPermission()
    }

    private fun getPermission() {
        val permissioner = PermissionRequester(context as AppCompatActivity)
        val permissionCallback = object : PermissionCallback {
            override fun onPermissionGranted() {
                startRecording()
            }
            
            override fun onPermissionDenied() {
            }
        }
        permissioner.setListener(permissionCallback)
        permissioner.requestPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    }

    private fun startRecording() {
        val videoInput = VideoFileRecorder(context).recordeVideo()
        FileSaver(context).saveFile("Videos", generateVideoFileName(), videoInput)
    }
    
    @SuppressLint("SimpleDateFormat")
    private fun generateVideoFileName(): String {
        return "video_" + SimpleDateFormat("yyyy.mm.dd__kk.mm").format(Date()) +
                "__" + System.nanoTime().toString().takeLast(6) + ".mp4"
    }
}