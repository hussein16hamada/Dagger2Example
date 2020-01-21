package com.hussein.dagger.di;

import com.hussein.dagger.di.auth.AuthModeule;
import com.hussein.dagger.di.auth.AuthViewModelModule;
import com.hussein.dagger.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuildersModule {

    // put the dependencies are related to  activities

    @ContributesAndroidInjector(
            modules = {
                    // sub components (Modules)
                    AuthViewModelModule.class,
                    AuthModeule.class,
            })
    abstract AuthActivity contributeAuthAcrivity();


}
