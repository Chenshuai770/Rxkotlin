package com.cs

import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy

fun main(args: Array<String>) {
    var count = Observable.just(2, 30, 22, 5, 60, 1).count()
    //统计元素数量
    count.subscribeBy {
        println(it)
    }
}