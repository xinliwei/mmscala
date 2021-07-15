package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  */
object CaseClassDemo {

  // 定义一个代表人的case类
  case class Person(name:String,age:Int,salary:Double)

  def main(args: Array[String]): Unit = {
    val p1 = Person("张三",23,18000.00)
    val p2 = Person("李四",33,28000.00)

    println(p1)
    println(p1.name)
    println(p2)
  }
}
