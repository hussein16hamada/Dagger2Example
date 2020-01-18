package com.hussein.dagger.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    // Application level dependencies
    // put other dependencies that are not related to activities
    // like Glide , Retrofit ....
    // Methods here better to be static like doc said
    @Provides
    static String Somthing(){
        return "testttttttt";
    }
}
