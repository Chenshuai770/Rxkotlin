package com.cs

import io.reactivex.Observable
import io.reactivex.subjects.AsyncSubject

/**
 * AsyncSubject 会从 源Observable(Subject 的 Observer 接口传入值来自 源Observable) 接收所有值,并把最后一个值从 Observable 接口处弹出去,看一个例子
 */
fun main(args: Array<String>) {
    val observable=Observable.just(1,2,3,4)
    val subject=AsyncSubject.create<Int>()
    observable.subscribe(subject)
    subject.subscribe(observer)

}