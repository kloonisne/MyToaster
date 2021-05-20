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
//            val inflater: LayoutInflater = LayoutInflater.from(this)
//            val view: View = inflater.inflate(
//                com.task.mylibrary.R.layout.item_toast, (this).findViewById(
//                    com.task.mylibrary.R.id.toastRoot))
//            val toast = Toast(this)
//            toast.setGravity(Gravity.BOTTOM,0,150)
//            toast.duration = Toast.LENGTH_LONG
//            toast.view = view
//            toast.show()

        }
    }
}