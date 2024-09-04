package com.iessanandres.androidmodeltreinning

import androidx.lifecycle.ViewModel

class LoginViewModel(private val signInUseCase: SignInUseCase) : ViewModel() {

    fun validateClicked(userName: String, password: String): Boolean {
        return signInUseCase.invoke(userName, password)
    }
}