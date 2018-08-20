package com.cs

import io.reactivex.rxkotlin.toObservable

/**
 * Cold Observable 更像是光盘(容量可能无限),随时打开都能从头开始听。
 */
fun main(args: Array<String>) {
    //todo 这里是从头开始的,没有连续比对下去的 Cold Observable
    /*val observable= listOf<Int>(1,2,3,4).toObservable()
    observable.subscribe(observer)
    observable.subscribe(observer)*/
    //todo 这里是从头开始的,没有连续比对下去的 Hot Observable
    val connectableObservable = listOf<Int>(1, 2, 3, 4).toObservable().publish()
    connectableObservable.subscribe {
        println("Subscription 1: $it")
    }
    connectableObservable.subscribe({
        println("Subscription 2: $it")
    })
    connectableObservable.connect()//调用 connet()之后才会发送消息

    println("Sleep 1 starts")
    Thread.sleep(20)
    println("Sleep 1 ends")
    connectableObservable.subscribe({ println("Subscription 3: $it") })  // 不用再次调用 connect 方法
    println("Sleep 2 starts")
    Thread.sleep(30)
    println("Sleep 2 ends")


}