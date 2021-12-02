package com.axelessono.projetun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
    }

    fun switchActivity(view: android.view.View) {

        val intent = Intent(applicationContext, RelativeActivity::class.java)
        startActivity(intent)
    }
}