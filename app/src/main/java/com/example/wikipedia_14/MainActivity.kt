package com.example.wikipedia_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wikipedia_14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarMain)
    }
}