package com.mm.day1

/**
  * Created by tongyao on 2021-07-12.
  *
  * 数据类型：Scala中，一切皆对象。
  */
object demo03 {
  def main(args: Array[String]): Unit = {
//    val salary:Double = 3215.67
    val salary = 3215.67
    // 查看数据类型
    println(salary.getClass().getSimpleName())

//    val price:Float = 123.56f
    val price = 123.56f
    // 在scala中，无参函数，小括号可以省略
    println(price.getClass.getSimpleName)

    println(2 + 3)
    println(2.+(3))

    // 对象比较
    println(("he" + "llo") == "hello")
  }
}
