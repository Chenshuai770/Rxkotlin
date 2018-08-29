package com.cs.rxkotlin

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

fun main(args: Array<String>) {
    Observable.just(1,2,3).map { Item(it) }
            .observeOn(Schedulers.newThread())//todo 这里只需要知道这一行代码使得 Observer 在另一个线程中运行即可
            .subscribe{
                Thread.sleep(100)
                println("Received $it")
            }
    Thread.sleep(1000)
}