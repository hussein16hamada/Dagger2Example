package com.hussein.dagger.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.hussein.dagger.R;
import com.hussein.dagger.ViewModels.ViewModelProviderFactory;
import com.hussein.dagger.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    private AuthViewModel authViewModel;
    @Inject
    ViewModelProviderFactory ProviderFactory;

    @Inject
    RequestManager requestManager;

    @Inject
    Drawable logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        authViewModel=  new ViewModelProvider(this,ProviderFactory).get(AuthViewModel.class);
        setLogo();

    }

    private void setLogo(){
        requestManager.load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }
}
