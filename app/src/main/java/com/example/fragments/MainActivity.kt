package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        binding.btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flFragment.id, firstFragment)
                addToBackStack("FirstFragment")
                commit()
            }
        }

        binding.btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flFragment.id, secondFragment)
                addToBackStack("SecondFragment")
                commit()
            }
        }

    }
}