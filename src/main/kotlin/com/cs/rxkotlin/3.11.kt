package com.cs.rxkotlin

import io.reactivex.Observable

fun main(args: Array<String>) {
    Observable.range(1,4).subscribe(observer)
}