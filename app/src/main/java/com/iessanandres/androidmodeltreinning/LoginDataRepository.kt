package com.iessanandres.androidmodeltreinning

class LoginDataRepository(private val remoteDataSource: LoginMockRemoteDataSource) :
    LoginRepository {
    override fun isValid(userName: String, password: String): Boolean {
        return remoteDataSource.validate(userName, password)

    }

}