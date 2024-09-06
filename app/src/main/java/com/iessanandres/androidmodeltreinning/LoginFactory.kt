package com.iessanandres.androidmodeltreinning

import android.content.Context
import com.iessanandres.probandootraforma.features.login.domain.DeleteUsernameUseCase
import com.iessanandres.probandootraforma.features.login.domain.GetUsernameUseCase

class LoginFactory(private val context: Context) {

    private val loginMockRemoteDataSource: LoginMockRemoteDataSource =
        LoginMockRemoteDataSource()

    private val loginXmlLocalDataSource: LoginXmlLocalDataSource =
        provideLoginXmlRemoteDatasource()

    private val loginRepository: LoginRepository = provideLoginDataRepository()

    private val signInUseCase: SignInUseCase = provideSignInUseCase()

    private val saveUsernameUseCase: SaveUsernameUseCase = provideSaveUsernameCase()

    private val deleteUsernameUseCase: DeleteUsernameUseCase = provideDeleteUsernameCase()

    private val getUsernameUseCase: GetUsernameUseCase = provideGetUsernameCase()

    fun provideLoginViewModel(): LoginViewModel {
        return LoginViewModel(signInUseCase, saveUsernameUseCase, deleteUsernameUseCase, getUsernameUseCase)
    }
    // fun provideLoginViewModel() = LoginViewModel() --> Esto es equivalente al anterior


    private fun provideLoginMockRemoteDataSource(): LoginMockRemoteDataSource {
        return LoginMockRemoteDataSource()
    }

    private fun provideLoginDataRepository(): LoginRepository {
        return LoginDataRepository(loginXmlLocalDataSource, loginMockRemoteDataSource)
    }

    private fun provideLoginXmlRemoteDatasource(): LoginXmlLocalDataSource {
        return LoginXmlLocalDataSource(context)
    }

    private fun provideSignInUseCase(): SignInUseCase {
        return SignInUseCase(loginRepository)
    }

    private fun provideSaveUsernameCase(): SaveUsernameUseCase {
        return SaveUsernameUseCase(loginRepository)
    }

    private fun provideDeleteUsernameCase(): DeleteUsernameUseCase {
        return DeleteUsernameUseCase(loginRepository)
    }

    private fun provideGetUsernameCase(): GetUsernameUseCase {
        return GetUsernameUseCase(loginRepository)
    }
}