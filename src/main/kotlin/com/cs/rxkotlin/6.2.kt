package com.cs.rxkotlin

import io.reactivex.Observable

fun main(args: Array<String>) {
    val observable = Observable.just(2, 30, 22, 5, 60, 1)
    observable.filter { x -> x > 10 }.subscribe(observer)  // it > 10
}


