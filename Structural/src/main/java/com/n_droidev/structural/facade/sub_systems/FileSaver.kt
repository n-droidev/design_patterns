package com.n_droidev.structural.facade.sub_systems

import android.content.Context
import android.widget.Toast
import java.io.*


class FileSaver(private var context: Context) {
    fun saveFile(path: String, fileName: String, inputStream: InputStream) {
        val file = File(context.getExternalFilesDir("Media"), path)
        if (!file.exists()) {
            file.mkdir()
        }

        var os: OutputStream? = null
        try {
            os = FileOutputStream(File(file,fileName))
            val buffer = ByteArray(1024)
            var length: Int
            while (inputStream.read(buffer).also { length = it } > 0) {
                os.write(buffer, 0, length)
            }
            Toast.makeText(context,"Video recorded and saved successfully!",
                Toast.LENGTH_LONG).show()
        } finally {
            inputStream.close()
            os!!.flush()
            os.close()
        }
    }
}