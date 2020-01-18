package com.hussein.dagger.di.auth;

import androidx.lifecycle.ViewModel;

import com.hussein.dagger.di.ViewModelKey;
import com.hussein.dagger.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    // Do the same for every viewModel i have Here
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);
}
