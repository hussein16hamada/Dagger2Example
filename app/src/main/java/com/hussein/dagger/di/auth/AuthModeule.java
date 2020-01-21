package com.hussein.dagger.di.auth;

import com.hussein.dagger.Network.auth.AuthApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AuthModeule {

    @Provides
    static AuthApi authApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }

}
