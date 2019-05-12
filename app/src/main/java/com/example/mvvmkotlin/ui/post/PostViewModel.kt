package com.example.mvvmkotlin.ui.post

import android.arch.lifecycle.MutableLiveData
import com.example.mvvmkotlin.base.BaseViewModel
import com.example.mvvmkotlin.model.Post

class PostViewModel : BaseViewModel(){

    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle(): MutableLiveData<String> = postTitle
    fun getPostBody(): MutableLiveData<String> = postBody
}