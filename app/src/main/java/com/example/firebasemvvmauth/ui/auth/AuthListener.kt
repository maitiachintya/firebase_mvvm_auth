package com.example.firebasemvvmauth.ui.auth

import android.os.Message

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}