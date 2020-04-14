package com.example.daggerswagger.di.main;

import com.example.daggerswagger.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {
@ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();
}