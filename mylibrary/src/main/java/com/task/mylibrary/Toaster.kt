package com.task.mylibrary

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object{
        fun show(ctx:Context, msg:String){
            Toast.makeText(ctx,msg,Toast.LENGTH_SHORT).show();
        }
    }
}