package com.cs.rxkotlin

import io.reactivex.Observable

fun main(args: Array<String>) {
    var observable = Observable.empty<String>()
    observable.subscribe(observer)

}