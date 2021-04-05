package com.san.loginwebsite

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val verification = LoginVerification()

    @Test
    fun loginSuccessful_whenCorrectCredentials(){
        assertTrue(verification.verify("san1@san.com", "san123"))
    }

    @Test
    fun loginUnsuccessful_whenWrongEmail(){
        assertFalse(verification.verify("ERROR@san.com", "san123"))
    }

    @Test
    fun loginUnsuccessful_whenWrongPassword(){
        assertFalse(verification.verify("san@san.com", "san123Error"))
    }
}