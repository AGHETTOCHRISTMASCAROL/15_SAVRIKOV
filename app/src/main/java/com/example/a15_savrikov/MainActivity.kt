package com.example.a15_savrikov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickStepsActivity2(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}