package com.example.mvvmkotlin.base

import android.arch.lifecycle.ViewModel
import com.example.mvvmkotlin.injection.component.ViewModelInjector
import com.example.mvvmkotlin.module.NetworkModule
import com.example.mvvmkotlin.ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject(){
        when(this){
            is PostListViewModel -> injector.inject(this)
        }
    }
}