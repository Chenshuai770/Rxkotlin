package com.cs

import io.reactivex.Observable
import java.util.*

fun main(args: Array<String>) {
    var list = listOf(1, 2, 3, 4)
    var observable = Observable.fromIterable(list)
    observable.subscribe(observer)
}