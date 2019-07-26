package com.planatech.gitrate.skeleton.base

import android.app.Activity
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment(), BaseView {

    override fun getThisActivity(): Activity?{
        return activity
    }
}