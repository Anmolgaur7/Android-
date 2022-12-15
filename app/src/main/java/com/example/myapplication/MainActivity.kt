package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val x=findViewById<Button>(R.id.CreateBirthdayButton)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        x.setOnClickListener{
            Toast.makeText( this,"Button was clicked" ,Toast.LENGTH_SHORT)
        }
    }
}