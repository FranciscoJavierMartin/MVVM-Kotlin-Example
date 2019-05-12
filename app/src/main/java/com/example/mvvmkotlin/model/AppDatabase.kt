package com.example.mvvmkotlin.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun postDao(): PostDAO
}