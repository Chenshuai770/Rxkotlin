package com.cs.rxkotlin

import io.reactivex.Observable

fun main(args: Array<String>) {
    Observable.just(54).subscribe(observer)
    Observable.just(listOf(1, 2, 3)).subscribe(observer)
    Observable.just(1, 2, 3).subscribe(observer)
}