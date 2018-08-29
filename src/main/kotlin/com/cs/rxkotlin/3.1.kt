package com.cs.rxkotlin

import io.reactivex.Observable.create


fun main(args: Array<String>) {

    var observable = create<Int>() {
        it.onNext(1)
        it.onError(Exception("Custom Exception"))
        it.onNext(2)
        it.onComplete()
        it.onNext(3)
    }



    observable.subscribe(observer)
}