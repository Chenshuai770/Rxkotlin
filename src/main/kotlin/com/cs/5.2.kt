package com.cs

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val observable = Observable.interval(100, TimeUnit.MILLISECONDS)

    observable.subscribe({ println("Subscription 1 Received $it") })
    Thread.sleep(200)
    observable.subscribe({ println("Subscription 2 Received $it") })
    Thread.sleep(300)
}

