package com.cs

import io.reactivex.Observable
import io.reactivex.functions.Function

fun main(args: Array<String>) {
    Observable.just(2)
            .map(object : Function<Int, Int> {
                override fun apply(t: Int): Int {
                    return t + 2
                }
            })
            .subscribe{
                println(it)
            }
}

