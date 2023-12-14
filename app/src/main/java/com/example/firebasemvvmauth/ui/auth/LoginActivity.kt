package com.example.firebasemvvmauth.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.firebasemvvmauth.R
import com.example.firebasemvvmauth.databinding.ActivityLoginBinding
import com.example.firebasemvvmauth.ui.home.HomeActivity
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class LoginActivity : AppCompatActivity() {

    private lateinit var progressbar: ProgressBar

    //private val factory : AuthViewModelFactory by instance()
    private lateinit var viewModel: AuthViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        /*val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
//        viewModel = ViewModelProviders.of(this, factory).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this*/
    }
}

    /*override val kodein: Kodein
        get() = TODO("Not yet implemented")*/

    /*override fun onStarted() {
        progressbar.visibility = View.VISIBLE
    }

    override fun onSuccess() {
        progressbar.visibility = View.GONE
        //startHomeActivity()
    }

    private fun startHomeActivity() {
        Intent(this, HomeActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(it)
        }
    }

        override fun onFailure(message: String) {
            progressbar.visibility = View.GONE
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }

        override fun onStart() {
            super.onStart()
            viewModel.user?.let {
                startHomeActivity()
            }
    }
}*/