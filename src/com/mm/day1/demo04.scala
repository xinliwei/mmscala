package com.mm.day1

import scala.io.StdIn

/**
  * Created by tongyao on 2021-07-12.
  *
  * 请编写scala 代码，计算工人报酬。计算原则如下：
  * - 前40 个小时，按小时付报酬，每小时50 元；
  * - 超过40 小时，应该付1.5 倍报酬。
  *
  * 工时是变化的，我们从命令行输入。(scala.io.StdIn)
  */
object demo04 {
  def main(args: Array[String]): Unit = {
    // 声明一个变量，来存储输入的工时
//    val workHours:String = StdIn.readLine("请输入工时：")
    val workHours = StdIn.readLine("请输入工时：")  // 使用类型推断

    // 声明一个变量，用来存储计算的报酬
    var reward = 0.0

    // 将String类型的工时转换为Int类型
    val workHoursInt = workHours.toInt

    // 条件判断
    if(workHoursInt<=40){
      reward = workHoursInt * 50
    }else{
      reward = 40 * 50 + (workHoursInt-40) * (50 * 1.5)
    }

    // 输出计算结果
//    println(reward)
//    println("工作了" + workHoursInt + "小时，薪酬是" + reward)
    // 字符串插值
//    println(s"工作了${workHoursInt} 小时，薪酬是${reward}")
    println(s"工作了${workHoursInt}hours，薪酬是$reward")
  }
}
