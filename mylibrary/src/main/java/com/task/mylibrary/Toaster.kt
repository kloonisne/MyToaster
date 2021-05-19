package com.task.mylibrary

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


class Toaster {
    companion object{
        fun show(ctx: Activity, msg: String){
            val inflater: LayoutInflater = LayoutInflater.from(ctx)
            val view:View = inflater.inflate(R.layout.item_toast, (ctx).findViewById(R.id.toastRoot))
            val txtMsg:TextView = view.findViewById(R.id.toastMessage)
            txtMsg.text = msg
            val toast = Toast(ctx)
            toast.setGravity(Gravity.BOTTOM,0,0)
            toast.duration = Toast.LENGTH_LONG
            toast.view =view
            toast.show()
        }
    }
}