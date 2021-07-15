package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  */
object CaseClassDemo2 {

  // 定义一个代表人的case类
  case class Person(name:String,age:Int,salary:Double)

  // 定义一个函数，使用模式匹配，来过滤35岁以上的员工
  def older(person:Person): Option[Boolean] = {
    person match{
      case Person(_,age,_) if age>=35 => Some(true)
      case _ => None
    }
  }

  def main(args: Array[String]): Unit = {
    // 创建一批员工信息
    val peoples = List(
      Person("李四",40,18000.00),
      Person("张三",23,8000.00),
      Person("王老五",45,28000.00)
    )

    // 过滤出“老”员工
    peoples.filter(p => older(p).getOrElse(false)).foreach(println)
  }
}
