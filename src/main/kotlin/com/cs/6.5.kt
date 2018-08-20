package com.cs

import io.reactivex.Observable

fun main(args: Array<String>) {
    Observable.range(0, 10)
            .filter { it > 15 }
            .defaultIfEmpty(15)
            .subscribe(observer)
}
