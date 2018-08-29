package com.cs.rxkotlin

import io.reactivex.Observable

fun main(args: Array<String>) {
    // 下面两者等效
    Observable.just(1, 2, 3).subscribe(observer)
    Observable.fromIterable(listOf(1, 2, 3)).subscribe(observer)
}

