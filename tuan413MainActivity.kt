package com.example.myapplication.tuan413

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class tuan413MainActivity : AppCompatActivity() {
    var btn:Button? =null
    var tvKQ:TextView? = null
    var context: Context=this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan413_main)
        btn=findViewById(R.id.tuan413btn)
        tvKQ=findViewById(R.id.tuan413tv)
        val fn=VolleyKotlinFn()
        btn!!.setOnClickListener{
            fn.getJSON_ArrayObject(context, tvKQ!!)
        }

    }
}