package com.san.loginwebsite

class LoginVerification {

    fun verify(email: String, password: String): Boolean{
        return email == "san1@san.com" && password == "san123"
    }


}