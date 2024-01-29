package com.example.myapplication.tuan413

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyKotlinFn {
    var strJSON=""
    fun getJSON_ArrayObject(context: Context, textView: TextView){
     val queue=Volley.newRequestQueue(context)
     val url="http://10.0.0.119/ajson/a.json"
        val  request=JsonArrayRequest(url,
            {
                response ->
                for(i in 0 until response.length())
                {
                val person=response.getJSONObject(i)
                val id=person.getString("id")
                    val name=person.getString("name")
                    val email=person.getString("email")
                strJSON +="id: $id\n"
                    strJSON +="name: $name\n"
                    strJSON +="email: $email\n"
                }
                textView.text=strJSON
            },
            {
                error ->  textView.text= error.message
            }
            )
        queue.add(request)
    }
}