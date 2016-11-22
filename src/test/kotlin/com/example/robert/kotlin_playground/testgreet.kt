package com.example.robert.kotlin_playground

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Created by robert on 2016/11/22.
 */
class TestGreet() {
    @Test
    fun testGreeting() {
        assertEquals("Greeting should be 'Hello World!'", "Hello World!", greeting())
    }
}