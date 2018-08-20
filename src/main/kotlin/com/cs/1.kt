package com.cs


import io.reactivex.*
import io.reactivex.rxkotlin.*


fun main(args: Array<String>) {

    val list: List<Any> = listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f)  // 类型标注可省,这里添加是为了看得清楚,下同
    val observable: Observable<Any> = list.toObservable()
    observable.subscribeBy(
            onNext = { println(it)},
            onError = { println(it.printStackTrace())},
            onComplete = { println("Done!")}
    )

}