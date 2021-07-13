package com.mm.day1

/**
  * Created by tongyao on 2021-07-12.
  *
  * Scala中的for循环
  */
object demo06 {
  def main(args: Array[String]): Unit = {
    val fruits = Array("苹果","香蕉","火龙果")

    // 使用for-one循环
    for(f <- fruits){
      println(f)
    }

    println("----------------------")
    // 使用foreach高阶方法
    fruits.foreach(println)
  }
}
