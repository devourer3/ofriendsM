package com.gibeom.ofriendsmobile.di

import android.app.Application
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.gibeom.ofriendsmobile.BuildConfig
import com.gibeom.ofriendsmobile.data.local.AppDatabase
import com.gibeom.ofriendsmobile.data.remote.OfriendsService
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    fun provideCoroutineScopeIO() = CoroutineScope(Dispatchers.IO)

    @Singleton
    @Provides
    fun provideDatabase(app: Application) = AppDatabase.getInstance(app)

    @Singleton
    @Provides
    fun provideOfriendsDao(db: AppDatabase) = db.ofriendsDao()

    @Singleton
    @Provides
    fun provideOfriendsService(okhttpClient: OkHttpClient, converterFactory: GsonConverterFactory) =
        provideService(
            okhttpClient,
            converterFactory,
            clazz = OfriendsService::class.java,
            baseUrl = OfriendsService.END_POINT
        )

    @Provides
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(5, TimeUnit.SECONDS)
            .writeTimeout(5, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addNetworkInterceptor(StethoInterceptor())
            .build()

    @Provides
    fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().apply {
            level =
                if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        }

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()

    @Provides
    @Singleton
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory =
        GsonConverterFactory.create(gson)

    private fun <T> provideService(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory,
        clazz: Class<T>,
        baseUrl: String
    ): T {
        return createRetrofit(okhttpClient, converterFactory, baseUrl).create(clazz)
    }

    private fun createRetrofit(
        okhttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory,
        baseUrl: String
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okhttpClient)
            .addConverterFactory(converterFactory)
            .build()
    }

}