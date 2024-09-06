package com.iessanandres.probandootraforma.features.login.domain

import com.iessanandres.androidmodeltreinning.LoginRepository

class DeleteUsernameUseCase (private val loginRepository: LoginRepository) {
    operator fun invoke () {
        loginRepository.deleteUsername()
    }
}