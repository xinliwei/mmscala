package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * Tuple：元组
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val manyValues = ("张三", 23, 23000.00, '男', false)

    // 元组的位置是基于1，不能进行迭代
    println(manyValues._1)
    println(manyValues._2)
    println(manyValues._3)
    println(manyValues._4)
    println(manyValues._5)
  }
}
