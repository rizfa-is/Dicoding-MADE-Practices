package com.issog.cleanarchitecture.presentation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.issog.cleanarchitecture.databinding.ActivityMainBinding
import com.issog.cleanarchitecture.presentation.MainViewModel
import com.issog.cleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel> { MainViewModelFactory.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.setName("Dicoding")
        mainViewModel.message.observe(this) {
            binding.tvWelcome.text = it.welcomeMessage
        }
    }
}