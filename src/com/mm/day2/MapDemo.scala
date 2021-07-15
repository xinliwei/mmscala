package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * Map
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    // 初始化Map，有两种方式
    // 1）使用元组
    val map1 = Map(("a", 1),("b", 3),("c", 2))

    // 2) 使用 key->value 的形式
    val map2 = Map("a"->1,"b"->3,"c"->2)

    // 访问元素：使用key作为下标
    println(map1("a"))
    println(map2("c"))

    // 遍历一个map
    for(item <- map1){   // ("a", 1)
      val (k,v) = item   // (k,v) = ("a", 1)
      println(s"key=$k, value=$v")
    }

    // 也可以使用foreach方法  ("a", 1)
    map1.foreach(item => println(s"k=${item._1}, v=${item._2}"))
  }
}
