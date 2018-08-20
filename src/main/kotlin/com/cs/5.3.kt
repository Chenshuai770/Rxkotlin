package com.cs

// 5.3.kt
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val observable = Observable.interval(100, TimeUnit.MILLISECONDS)
    val subject = PublishSubject.create<Long>()

    observable.subscribe(subject)

    subject.subscribe({ println("Subscription 1 Received $it") })
    Thread.sleep(300)
    subject.subscribe({ println("Subscription 2 Received $it") })
    Thread.sleep(200)
}

