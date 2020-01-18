package com.hussein.dagger.di;

import androidx.lifecycle.ViewModelProvider;

import com.hussein.dagger.ViewModels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    // this responsible for providing tte ViewModelFactory
    // and has to add on AppComponent because gonna used by all ViewModels in the project
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);

}
