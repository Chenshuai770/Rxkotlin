package com.cs
// 6.6.kt
import io.reactivex.Observable

fun main(args: Array<String>) {
    Observable.just(2, 3)
            .startWith(1)
            .subscribe(observer)
}

