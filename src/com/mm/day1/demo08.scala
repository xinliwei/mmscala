package com.mm.day1

import scala.io.StdIn

/**
  * Created by tongyao on 2021-07-12.
  *
  * 使用模式匹配，实现一个简单的菜单选择功能
  */
object demo08 {
  def main(args: Array[String]): Unit = {
    // 定义一个菜单项
    val taste =
      """
        |"1. 香橙味"
        |"2. 桔子味"
        |"3. 水蜜桃味"
      """.stripMargin

    println(s"请选择口味: $taste")

    // 请用户输入菜单选项
    val option = StdIn.readLine("请选择您的口味：")
    val msg = option match{
      case "1" => "香橙味很不错"
      case "2" => "桔子味适合小朋友"
      case "3" => "水蜜桃味"
      case _ => "没有这种口味"
    }

    println(msg)
  }
}
