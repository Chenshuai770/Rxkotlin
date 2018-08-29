package com.cs.rxkotlin

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

/**
 * interval 隔一定的时间弹射一个值
 */
fun main(args: Array<String>) {
    Observable.interval(600,TimeUnit.MILLISECONDS).subscribe(observer)
    Thread.sleep(5000)
}