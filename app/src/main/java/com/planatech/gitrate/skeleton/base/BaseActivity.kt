package com.planatech.gitrate.skeleton.base

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity(), BaseView {

    override fun getThisActivity(): Activity? {
        return this
    }

}