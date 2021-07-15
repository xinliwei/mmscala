package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * List使用
  */
object ListDemo {
  def main(args: Array[String]): Unit = {
    // 初始化一个列表
    val list1 = List("苹果","香蕉","葡萄干")

    // 在最后追加一个元素
    val list2 = list1 :+ "火龙果"

    // 在开头追加一个元素
    val list3 = "桔子" +: list1

    // 两个列表的连接合并(list2, list3(0),list3(1),...)
    val list4 = list2 :: list3

    // 将两个列表的所有元素合并
    val list5 = list2 ::: list3

//    list2.foreach(println)
//    list3.foreach(println)
//    list4.foreach(println)
    list5.foreach(println)
  }
}
