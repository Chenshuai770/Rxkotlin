package com.cs

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val observable: Observable<Long> = Observable.interval(100, TimeUnit.MILLISECONDS)

    val observer: Observer<Long> = object : Observer<Long> {
        lateinit var disposable: Disposable
        override fun onComplete() {
            println("Complete")
        }

        override fun onSubscribe(d: Disposable) {
            disposable = d
        }

        override fun onNext(item: Long) {

            if (item >= 5 && !disposable.isDisposed) {
                disposable.dispose()//取消订阅器
                println("Disposed")
            }
            println("Received $item")
        }


        override fun onError(e: Throwable) {
            println("Error:${e.message}")
        }

    }

    observable.subscribe(observer)
    Thread.sleep(1000)
}