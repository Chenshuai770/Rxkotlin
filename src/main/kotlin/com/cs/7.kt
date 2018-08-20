package com.cs

import io.reactivex.Observable
import io.reactivex.rxkotlin.toObservable

fun main(args: Array<String>) {
    val observable: Observable<Any> = listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f).toObservable()  // 类型标注可省,这里添加是为了看得清楚,下同
    observable.subscribe(observer)
}