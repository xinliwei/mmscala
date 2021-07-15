package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * Scala集合上的高阶方法：算子
  */
object OrderFuncDemo {
  def main(args: Array[String]): Unit = {
    // map：一对一的转换  MapReduce = Map + Reduce
    val list1 = List(1,2,3,4,5)
    val list2 = list1.map(x => x * 10)
    list2.foreach(println)

    println("----------------")
    // filter:过滤，得到子集
    val list3 = list1.filter(x => x%2 == 0)
//    list3.foreach(println)
//    list3.foreach(x => println(x))
//    list3.foreach(println(_))
    list3.foreach(println)

    println("----------------")
    // flatMap = map + flatten
    // flatten？压扁
    val list4 = List(List(1,2,3),List(4,5,6))   // List(1,2,3,4,5,6)
    val list5 = list4.flatten
    list5.foreach(println)

    println("----------------")
    // List(1,2,3)  -》 List(2,3)
    // List(4,5,6)  -》 List(5,6)
    // map -> List(List(2,3),List(5,6))
    // flatten -> List(2,3,5,6)
    list4.flatMap(item => item.tail).foreach(println)
  }
}
