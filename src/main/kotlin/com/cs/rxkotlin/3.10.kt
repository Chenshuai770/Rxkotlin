package com.cs.rxkotlin

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

/**
 * timer 一段时间后弹射一个值
 */
fun main(args: Array<String>) {
    Observable.timer(20,TimeUnit.MILLISECONDS).subscribe(observer)
    Thread.sleep(50)

}