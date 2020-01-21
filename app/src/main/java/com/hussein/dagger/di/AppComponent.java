package com.hussein.dagger.di;

import android.app.Application;

import com.hussein.dagger.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                // put this always
                AndroidSupportInjectionModule.class,
                // add what you want to be in app scoop
                ActivityBuildersModule.class,
                AppModule.class,
                // this to use MVVM
                ViewModelFactoryModule.class,

        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {


    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
