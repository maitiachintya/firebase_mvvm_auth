package com.example.firebasemvvmauth.ui.home

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.firebasemvvmauth.data.repository.UserRepository
import com.example.firebasemvvmauth.ui.auth.LoginActivity

class HomeViewModel(private val repository: UserRepository) : ViewModel() {
    val user by lazy {
        repository.currentUser()
    }

    fun logout(view: View){
        repository.logout()
        //view.context.startLoginActivity()
    }
}

private fun Context.startLoginActivity() {
    Intent(this, LoginActivity::class.java).also {
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }
}
