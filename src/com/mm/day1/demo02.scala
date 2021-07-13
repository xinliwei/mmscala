package com.mm.day1

/**
  * Created by tongyao on 2021-07-12.
  *
  * Scala 有两种类型变量：可变的var 和不可变的val
  *
  * Scala支持类型推断，所以在声明变量时，可以省略数据类型
  */
object demo02 {
  def main(args: Array[String]): Unit = {
    // 声明变量  val声明的变量不可重新赋值
//    val name:String = "张三"
    val name = "张三"     // 类型推断
    //name = "张小三"

//    var age: Int = 23
    var age = 23
    age = 25

    println(name)
    println(age)
  }
}
