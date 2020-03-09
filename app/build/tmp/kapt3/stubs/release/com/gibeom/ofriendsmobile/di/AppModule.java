package com.gibeom.ofriendsmobile.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J9\u0010\u001e\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/gibeom/ofriendsmobile/di/AppModule;", "", "()V", "createRetrofit", "Lretrofit2/Retrofit;", "okhttpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "baseUrl", "", "provideCoroutineScopeIO", "Lkotlinx/coroutines/CoroutineScope;", "provideDatabase", "Lcom/gibeom/ofriendsmobile/data/local/AppDatabase;", "app", "Landroid/app/Application;", "provideGson", "Lcom/google/gson/Gson;", "provideGsonConverterFactory", "gson", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOfriendsDao", "Lcom/gibeom/ofriendsmobile/data/local/OfriendsDao;", "db", "provideOfriendsService", "Lcom/gibeom/ofriendsmobile/data/remote/OfriendsService;", "provideOkHttpClient", "interceptor", "provideService", "T", "clazz", "Ljava/lang/Class;", "(Lokhttp3/OkHttpClient;Lretrofit2/converter/gson/GsonConverterFactory;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "app_release"})
@dagger.Module(includes = {com.gibeom.ofriendsmobile.di.ViewModelModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineScope provideCoroutineScopeIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.gibeom.ofriendsmobile.data.local.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.gibeom.ofriendsmobile.data.local.OfriendsDao provideOfriendsDao(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.data.local.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.gibeom.ofriendsmobile.data.remote.OfriendsService provideOfriendsService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    private final <T extends java.lang.Object>T provideService(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.Class<T> clazz, java.lang.String baseUrl) {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit(okhttp3.OkHttpClient okhttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.String baseUrl) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}