package com.planatech.gitrate.skeleton.base

import com.planatech.gitrate.skeleton.network.MyRetrofitBuilder
import retrofit2.Retrofit

open class CloudDataStore {

    var retrofit: Retrofit = MyRetrofitBuilder.build()

}