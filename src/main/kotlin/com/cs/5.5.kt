package com.cs

import io.reactivex.subjects.AsyncSubject

/**
 * AsyncSubject 当且仅当调用 onComplete 方法时才会弹出值(和( ConnectableObservable 与 connect 方法的关系)差不多)
所以 订阅1 并没有输出 Next 2 而是输出 Next 4。
 */
fun main(args: Array<String>) {
    val subject=AsyncSubject.create<Int>()

    subject.onNext(1)
    subject.onNext(2)
    subject.subscribe(observer)  // 订阅1
    subject.onNext(3)
    subject.subscribe(observer)  // 订阅2
    subject.onNext(4)
    subject.onComplete()


}