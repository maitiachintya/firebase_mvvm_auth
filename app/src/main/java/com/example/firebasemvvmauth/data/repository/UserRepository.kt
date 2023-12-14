package com.example.firebasemvvmauth.data.repository

import com.example.firebasemvvmauth.data.firebase.FirebaseSource
import com.google.firebase.ktx.Firebase

class UserRepository(private val firebase : FirebaseSource) {
    fun login(email : String, password : String) = firebase.login(email, password)
    fun register(email: String, password: String) = firebase.register(email, password)
    fun currentUser() = firebase.currentUser()
    fun logout() = firebase.logout()
}