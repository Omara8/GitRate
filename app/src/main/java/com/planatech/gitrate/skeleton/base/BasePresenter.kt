package com.planatech.gitrate.skeleton.base

import io.reactivex.disposables.Disposable

abstract class BasePresenter<T : BaseView>(val baseview : T) {

    var disposable: Disposable? = null

    abstract fun onAttach(view: T)

    open fun onViewCreated(view: T) {
        start()
    }

    open fun retry(){
        start()
    }

    open fun start(){

    }

    open fun stop(){
        disposable?.dispose()
    }

    fun getView(): T {
        return baseview
    }

    open fun onPause(){
        disposable?.dispose()
    }
}