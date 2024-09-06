package com.iessanandres.probandootraforma.features.login.domain

import com.iessanandres.androidmodeltreinning.LoginRepository

class GetUsernameUseCase(private val loginRepository: LoginRepository) {

    operator fun invoke(): String? {

        return loginRepository.getUsername()

    }
}
