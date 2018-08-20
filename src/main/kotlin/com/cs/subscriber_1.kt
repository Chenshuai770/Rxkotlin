package com.cs

import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

val subscriber_1=object :Subscriber<Item>{
    override fun onSubscribe(subscription: Subscription) {
        subscription.request(4)  // 注释1  限定请求 4 个值
        println("New Subscription ")
    }

    override fun onNext(s: Item) {
        Thread.sleep(200)
        println("Subscriber received " + s)
    }

    override fun onError(e: Throwable) {
        e.printStackTrace()
    }

    override fun onComplete() {
        println("Done!")
    }



}