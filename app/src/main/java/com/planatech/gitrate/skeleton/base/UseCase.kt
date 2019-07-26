package com.planatech.gitrate.skeleton.base

import io.reactivex.disposables.Disposable

interface UseCase<out T>{

    fun execute(success: (response: T) -> Unit, failure: (error: T) -> Unit) : Disposable

}