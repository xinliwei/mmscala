package com.mm.day1

import scala.io.StdIn

/**
  * Created by tongyao on 2021-07-12.
  *
  * 简单模式匹配 - 实现Java语言中switch的功能
  */
object demo07 {
  def main(args: Array[String]): Unit = {
    // 输入一个数字，输出对应的星期
    val number:String = StdIn.readLine("请输入一个数字：")


    // 方式一
    /*
    number match {
      case "1" => println("星期一")
      case "2" => println("星期二")
      case "3" => println("星期三")
      case "4" => println("星期四")
      case "5" => println("星期五")
      case "6" => println("星期六")
      case "7" => println("星期天")
    }*/

    // 方式：模式匹配还可以返回值
    val weekday = number match {
      case "1" => "星期一"
      case "2" => "星期二"
      case "3" => "星期三"
      case "4" => "星期四"
      case "5" => "星期五"
      case "6" => "星期六"
      case "7" => "星期天"
      case _   => "输入错误"
    }
    println(s"今天是$weekday")
  }
}
