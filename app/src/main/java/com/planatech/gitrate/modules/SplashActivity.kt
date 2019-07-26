package com.planatech.gitrate.modules

import android.os.Bundle
import com.planatech.gitrate.R
import com.planatech.gitrate.skeleton.base.BaseActivity

class SplashActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

}