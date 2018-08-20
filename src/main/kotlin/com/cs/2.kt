package com.cs

import io.reactivex.subjects.PublishSubject

fun isEvenOrOdd(n: Int): String = if ((n % 2 == 0)) "Even" else "Odd"

inline fun doSomeStuff(a: Int) = a * a

fun main(args: Array<String>) {
    val subject = PublishSubject.create<Int>()

    subject.map { isEvenOrOdd(it) }
            .subscribe {
                println("The number is $it")
            }
    subject.onNext(2)
    subject.onNext(3)
    subject.onNext(4)

    for (i in 1..5){
        println("$i output ${doSomeStuff(i)} " )
    }
}