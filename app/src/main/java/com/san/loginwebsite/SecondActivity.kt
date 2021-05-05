package com.san.loginwebsite

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){

    var txtString: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        txtString =  findViewById(R.id.UserEmail)

        var msg = StringBuilder("Welcome  ")

        //var intent = intent
        var b = intent.extras
        var email = b!!.getString("email", "default@default.com")
        msg.append(email)
        txtString?.setText(msg)
        Log.d("User in second activity", msg.toString())




    }
}