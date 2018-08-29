package com.cs.rxkotlin

import io.reactivex.Observable
import io.reactivex.functions.Function


fun main(args: Array<String>) {
    var flatMapObservable = Observable.just("Hello")
            .flatMap(object : Function<String, Observable<String>> {
                override fun apply(t: String): Observable<String> {
                    return Observable.just("Hello,World")
                }

            })

    flatMapObservable.subscribe(observer)

}