package com.cs

import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

fun main(args: Array<String>) {
    Flowable.just(1, 2, 3).map { Item(it) }
            .observeOn(Schedulers.newThread())
            .subscribe {
                Thread.sleep(100)
                println("Recieved $it")
            }
    Thread.sleep(1000)
}