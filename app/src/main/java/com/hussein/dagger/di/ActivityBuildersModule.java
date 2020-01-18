package com.hussein.dagger.di;

import com.hussein.dagger.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    // put the dependencies are related to  activities

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthAcrivity();


}
