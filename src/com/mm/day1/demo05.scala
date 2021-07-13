package com.mm.day1

/**
  * Created by tongyao on 2021-07-12.
  *
  * 数组的简单使用
  */
object demo05 {
  def main(args: Array[String]): Unit = {
    // 创建的同时赋初值；
//    val fruits: Array[String] = Array("苹果","香蕉","火龙果")
    val fruits = Array("苹果","香蕉","火龙果")

    // 访问元素-通过下标
    println(fruits(0))

    // 先创建，后赋值
//    val arrs:Array[Int] = new Array[Int](3)
    val arrs = new Array[Int](3)
    arrs(0) = 1
    arrs(1) = 2
    arrs(2) = 12

    println(arrs(2))
  }
}
