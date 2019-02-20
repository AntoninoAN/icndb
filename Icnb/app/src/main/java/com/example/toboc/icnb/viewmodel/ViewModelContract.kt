package com.example.toboc.icnb.viewmodel

import android.arch.lifecycle.ViewModel

interface ViewModelContract {
    fun getRamdomJokes()
    fun getCharacterJokes(firstName : String, lastName : String)
    fun getEndlessJokes()
}