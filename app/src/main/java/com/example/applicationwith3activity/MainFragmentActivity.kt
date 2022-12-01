package com.example.applicationwith3activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationwith3activity.databinding.ActivityMainBinding

class MainFragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}