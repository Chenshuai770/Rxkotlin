package com.cs

import io.reactivex.Observable

/**
 * subscribe 的参数都能是什么

subscribe 在 ReactiveX 中有几个重载方法,这里不列出。基本模式有这两个

subscribe(onNext,onError,onComplete,onSubscribe)
这几个参数都可以省略,但是只能从后往前省略(这句是废话)
是废话也要说,因为 subscribe 是在 Java 文件中定义的,不能使用 Kotlin 的命名参数
4.1.kt 中省略了 onSubscribe
subscribe(observer)
3.11.kt 已经很清晰,这里不展开了

 */
fun main(args: Array<String>) {
    val observable: Observable<Int> = Observable.range(1, 3)

    observable.subscribe({
        println("Next $it")
    }, {
        println("Error ${it.message}")
    }, {
        println("Done")
    })

}