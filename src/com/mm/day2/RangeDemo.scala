package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * Range： to  until
  */
object RangeDemo {
  def main(args: Array[String]): Unit = {
    // to：包含上限
    (1 to 5).foreach(println)   // foreach：高阶方法
    println("--------------------")
    for(n <- 1 to 5){
      println(n)
    }

    println("===================")
    // until：不包含上限
    (1 until 5).foreach(println)   // foreach：高阶方法
    println("--------------------")
    for(n <- 1 until 5){
      println(n)
    }

    // Range -> List
    val list1 = (1 to 100000).toList
    println(list1.length)
  }
}
