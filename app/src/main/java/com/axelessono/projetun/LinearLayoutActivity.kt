package com.axelessono.projetun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
    }

    fun switchActivity(view: android.view.View) {

        val intent = Intent(applicationContext, ConstraintActivity::class.java)
        startActivity(intent)

    }
}