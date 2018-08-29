package com.cs.rxkotlin

import io.reactivex.Observable

fun main(args: Array<String>) {
    var list = listOf(1, 2, 3, 4)
    var observable = Observable.fromIterable(list)
    observable.subscribe(observer)
}