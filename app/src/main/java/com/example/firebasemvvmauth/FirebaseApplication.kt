package com.example.firebasemvvmauth

import android.app.Application
import com.example.firebasemvvmauth.data.firebase.FirebaseSource
import com.example.firebasemvvmauth.data.repository.UserRepository
import com.example.firebasemvvmauth.ui.auth.AuthViewModelFactory
import com.example.firebasemvvmauth.ui.home.HomeViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class FirebaseApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@FirebaseApplication))
        bind() from singleton {
            FirebaseSource()
        }
        bind() from singleton {
            UserRepository(instance())
        }
        bind() from provider {
            AuthViewModelFactory(instance())
        }
        bind() from provider {
            HomeViewModelFactory(instance())
        }
    }
}