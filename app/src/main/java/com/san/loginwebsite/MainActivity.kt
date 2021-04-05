package com.san.loginwebsite

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()



    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextEmailAddress)
        password = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.login)

        login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (loginVerification.verify(email.text.toString(), password.text.toString())) {
            Toast.makeText(this, "Login is Successful", Toast.LENGTH_SHORT).show()
            Log.d("Password Successful", password.text.toString())
        } else {
            Toast.makeText(this, "Login Credential not matching", Toast.LENGTH_SHORT).show()
            Log.d("Password Un-successful", password.text.toString())
        }
    }
}


