package com.axelessono.projetun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)
    }

    fun switchActivity(view: android.view.View) {
        val intent = Intent(applicationContext, LinearLayoutActivity::class.java)
        startActivity(intent)
    }
}