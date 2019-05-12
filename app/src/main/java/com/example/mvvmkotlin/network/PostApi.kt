package com.example.mvvmkotlin.network

import com.example.mvvmkotlin.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}