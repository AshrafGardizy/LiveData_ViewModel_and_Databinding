package com.example.livedataviewmodelandbinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel :ViewModel() {

    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun updateCounter()
    {
        counter.value = (counter.value)?.plus(1)
    }
}