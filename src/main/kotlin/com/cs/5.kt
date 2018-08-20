package com.cs

import io.reactivex.Maybe
import io.reactivex.rxkotlin.subscribeBy

/**
onSuccess: maybeValue 有值的时候调用的函数
onComplete maybeValue 没有值的时候调用的函数
onError 出错处理函数
 */
fun main(args: Array<String>) {
    var maybeValue = Maybe.just(0)
    maybeValue.subscribeBy(
            onComplete = { println("Completed Empty") },
            onError = { println("Error $it") },
            onSuccess = { println("Complete with value $it") }
    )

}