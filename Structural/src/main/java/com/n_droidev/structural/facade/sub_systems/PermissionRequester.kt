package com.n_droidev.structural.facade.sub_systems

import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class PermissionRequester(private var context: AppCompatActivity) {
    var permissionCallback: PermissionCallback? = null

    fun setListener(permissionCallback: PermissionCallback) {
        this.permissionCallback = permissionCallback
    }

    fun requestPermission(permission: String) {
        val requestPermissionLauncher = context.registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                permissionCallback?.onPermissionGranted()
            } else {
                permissionCallback?.onPermissionDenied()
            }
        }
        requestPermissionLauncher.launch(permission)
    }
    
    interface PermissionCallback {
        fun onPermissionGranted()
        fun onPermissionDenied()
    }
}