package dev.toastcie.raytoastengine

import dev.toastcie.mathtoastools.vector.Vector3

class ToastMarching {

    fun test() {
        val a = Vector3(1.0f, 2.0f, 3.0f)
        val b = Vector3(4.0f, 3.0f, 2.0f)
        val c = a + b
        println(c.x + c.y + c.z)

    }
}