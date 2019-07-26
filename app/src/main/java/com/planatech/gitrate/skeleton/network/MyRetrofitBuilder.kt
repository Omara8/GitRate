package com.planatech.gitrate.skeleton.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class MyRetrofitBuilder {

    companion object {

        private const val baseUrl: String = "baseURL"

        fun build(): Retrofit {
            val httpClient = getHttpClientBuilder()
            return getRetroFit(httpClient)
        }

        private fun getRetroFit(httpClient: OkHttpClient.Builder): Retrofit {
            return Retrofit.Builder().baseUrl(baseUrl).
                addConverterFactory(MoshiConverterFactory.create()).
                addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
                client(httpClient.build()).build()
        }

        private fun getHttpClientBuilder(): OkHttpClient.Builder {
            val httpClient = OkHttpClient().newBuilder()
            httpClient.readTimeout(60, TimeUnit.SECONDS)
            httpClient.writeTimeout(60, TimeUnit.SECONDS)
            httpClient.connectTimeout(60, TimeUnit.SECONDS)
            return httpClient
        }

    }
}