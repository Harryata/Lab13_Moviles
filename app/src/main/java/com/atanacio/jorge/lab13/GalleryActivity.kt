package com.atanacio.jorge.lab13

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.atanacio.jorge.lab13.databinding.ActivityGalleryBinding
import java.io.File

class GalleryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val directory = File(getExternalMediaDirs()[0].absolutePath)
        val files = directory.listFiles() as Array<File>

        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }
}