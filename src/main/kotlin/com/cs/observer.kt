package com.cs

import io.reactivex.Observer
import io.reactivex.disposables.Disposable


/**
 * https://www.jianshu.com/p/a6b8c545505f
 * Observable Observer 与 subscribe
Observable: 可被观察的对象 (在英文里它是一个形容词,为了通顺,在这里用名词~)
Observer: 观察者
subscribe: 订阅

当然我们也可以这么理解

名称	翻译	比喻
Observable	可被观察的对象	电台
Observer	观察者	收音机
subscribe	订阅	调节收音机至电台频率
是电台发射信号,收音机接收。而不是收音机强迫电台发射信号(Observable 是主动者)

Observable(电台)数据的 生产者(在这里是 Observer)

基本上不需要手动创建,这里按下不表

Observer(收音机) 数据的 消费者(在这里是 Observer)

一个 Observer 需要实现四个方法

onNext: Observable 一个接一个地将所有内容传递给该方法。
onComplete: 当所有内容都处理后调用该方法
onError: 出错处理函数
onSubscribe: 开始订阅 Observable 时调用该方法
onError 和 onComplete都是终止方法, 当 onError 被调用时 onComplete 就不会被调用,反之亦然。

 */

//只定义了一个观察者
val observer: Observer<Any> =object :Observer<Any>{
    override fun onComplete() {
        println("All Complete" )
    }

    override fun onSubscribe(d: Disposable) {
        println("New Subscribe")
    }

    override fun onNext(t: Any) {
        println("next $t")
    }

    override fun onError(e: Throwable) {
        println("Error Occured ${e.message}")
    }

}

