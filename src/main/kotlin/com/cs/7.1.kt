package com.cs

import io.reactivex.Observable

/**
 * 同步线程
 */

fun main(args: Array<String>) {
    Observable.just(1,2,3).map { Item(it) }
            .subscribe{
                println("Received $it")
                Thread.sleep(100)
            }
    Thread.sleep(1000)
}