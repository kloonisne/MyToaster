package com.task.mylibraryinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.task.mylibrary.Toaster


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtHello = findViewById<TextView>(R.id.txtHello)
        txtHello.setOnClickListener {
            Toaster.show(this,"Yes I am working!!!! \n Yes I am working!!!! \n Yes I am working!!!! \n Yes I am working!!!!")
        }
    }
}