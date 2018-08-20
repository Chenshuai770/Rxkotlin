package com.cs

import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val observable=Observable.interval(10,TimeUnit.MILLISECONDS)
    val subject=PublishSubject.create<Long>()

    observable.subscribe(subject)
    subject.subscribeBy(
            onNext = {
                println("Received $it")
            }
    )
    Thread.sleep(60)
}