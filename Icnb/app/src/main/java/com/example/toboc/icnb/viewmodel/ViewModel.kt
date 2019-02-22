package com.example.toboc.icnb.viewmodel

import android.arch.lifecycle.ViewModel
import com.example.toboc.icnb.model.IcndbService

class ViewModel() : ViewModel(), ViewModelContract {
    val apiService : IcndbService by lazy { IcndbService.create() }

    override fun getRamdomJokes() {
        apiService.getSingleRandomJoke()
    }

    override fun getCharacterJokes(firstName: String, lastName: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEndlessJokes() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}