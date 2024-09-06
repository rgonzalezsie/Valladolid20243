package com.iessanandres.androidmodeltreinning

class LoginDataRepository(
    private val localDataSource: LoginXmlLocalDataSource,
    private val remoteDataSource: LoginMockRemoteDataSource
) :
    LoginRepository {

    override fun isValid(userName: String, password: String): Boolean {

        return remoteDataSource.validate(userName, password)

    }

    override fun saveUsername(userName: String) {

        localDataSource.saveUsername(userName)
    }

    override fun deleteUsername() {

        localDataSource.deleteUsername()
    }

    override fun getUsername(): String? {

        return localDataSource.getUsername()
    }

}