package com.cs

import io.reactivex.Observable

/**
 * Map 函数会把当前 Observable 中的每个值用传入的函数做一下变换再放入新的数据流中
重点在 源 Observable 并不会被修改
新的 这个词不恰当,因为这个计算有可能是 惰性的, 多次应用 Map 方法会在一次变换中完成,并不会创建多个 中间 Observable
上面例子中的 Map 就是一个 Operator (一会我们会更全面的理解它)。


 */
fun main(args: Array<String>) {
    val observable= Observable.just(1,2,3,4)
    observable.map { x->10*x }.map { x->x/5  }.subscribe(observer)
}