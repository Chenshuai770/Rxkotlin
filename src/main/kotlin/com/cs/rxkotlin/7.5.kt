package com.cs.rxkotlin

import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

fun main(args: Array<String>) {
    Flowable.range(1,3)//请求小于4就能执行done
            .map { Item(it) }
            .observeOn(Schedulers.newThread())
            .subscribe(subscriber_1)
    Thread.sleep(2000)
}