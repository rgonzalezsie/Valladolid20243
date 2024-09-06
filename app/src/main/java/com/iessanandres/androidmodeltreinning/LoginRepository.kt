package com.iessanandres.androidmodeltreinning

interface LoginRepository {

    fun isValid(userName: String, password: String): Boolean

    fun saveUsername(userName: String)

    fun deleteUsername()

    fun getUsername(): String?

}