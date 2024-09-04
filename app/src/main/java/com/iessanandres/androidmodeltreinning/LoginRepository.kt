package com.iessanandres.androidmodeltreinning

interface LoginRepository {

    fun isValid(userName: String, password: String): Boolean

}