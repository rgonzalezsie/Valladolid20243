package com.iessanandres.androidmodeltreinning

class SaveUsernameUseCase (private val loginRepository: LoginRepository) {

    operator fun invoke (userName: String) {
        loginRepository.saveUsername(userName)
    }



}