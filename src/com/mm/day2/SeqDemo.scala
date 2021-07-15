package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * Seq类似于Java语言中的接口
  */
object SeqDemo {
  def main(args: Array[String]): Unit = {
    // 初始化一个序列
//    val seq:Seq[String] = Seq("苹果","香蕉","葡萄干")
//    val seq = Seq("苹果","香蕉","葡萄干")
//    val seq = List("苹果","香蕉","葡萄干")
    val seq = Vector("苹果","香蕉","葡萄干")

    // 访问元素（注意下标，使用的是圆括号）
    println(s"索引0处的元素 = ${seq(0)}")
    println(s"索引0处的元素 = ${seq(1)}")
    println(s"索引0处的元素 = ${seq(2)}")
    println(s"最后一个的元素 = ${seq.last}")

    println("------------------------------")
    // Seq是一个递归的数据结构
    println(s"头部的元素 = ${seq.head}")
    println(s"尾部的元素 = ${seq.tail}")
    println(s"尾部的元素 = ${seq.tail.head}")
    println(s"尾部的元素 = ${seq.tail.tail}")

    println("------------------------------")
    // 向集合中添加元素，会返回一个新集合
    val seq2 = seq :+ "火龙果"

    // 遍历
    // 1) 传统的方式: for循环
    for(e <- seq2){
      println(e)
    }
    println("------------------------------")
    // 2) 方式2：foreach
    seq2.foreach(println)

    // 创建一个空的集合
//    val emptySeq = Seq.empty
//    val emptySeq = List.empty[String]
    val emptySeq = Vector.empty[String]
    println(emptySeq)

    println("------------------------------")
    // 另外，对于数字集合，Scala提供了常用的描述性统计的方法实现
//    val numbers = Seq(1,3,5,7,9)
//    val numbers = List(1,3,5,7,9)
    val numbers = Vector(1,3,5,7,9)
    println(s"sum = ${numbers.sum}")
    println(s"max = ${numbers.max}")
    println(s"min = ${numbers.min}")
  }
}
