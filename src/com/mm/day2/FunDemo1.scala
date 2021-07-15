package com.mm.day2

/**
  * Created by tongyao on 2021-07-14.
  *
  * 函数字面量
  */
object FunDemo1 {
  def main(args: Array[String]): Unit = {
    // 定义一个值函数
    val func1 = ()=>println("hello")

    // 执行函数
    func1()

    // 定义一个值函数
    val func2 = (msg:String)=>println(msg)

    // 执行函数
    func2("吃了吗？")

    // 定义函数，没有返回值 Unit相当于Java中的void
    def message(msg:String):Unit = {
      println(msg)
    }
    message("hello scala!")

    // 定义有返回值的函数，默认值参数
    def info(name:String,age:Int=18,salary:Double=8000): String = {
      val msg = name + "-" + age + "-" + salary
      msg  // scala中，函数的最后一行，自动返回
    }
    // 调用info函数
    val intro = info("张三",23,23000.00)
    println(intro)

    // 如果调用info函数时，参数顺序不对，会怎么样？
    // val intro2 = info(23,"张三",23000.00)
    val intro2 = info(age=23,name="张三",salary=23000.00)
    println(intro2)

    // 使用默认参数
    val intro3 = info(name="张三",salary=23000.00)
    println(intro3)

    // 声明可变参数（变长参数：0,1,n...）
    def totalSalay(name:String,baseSalary:Double, varSalary:Double*):Unit = {
      val total = baseSalary + varSalary.sum
      println(s"${name}的总收入 = $total")
    }

    totalSalay("张三",8000.00)
    totalSalay("张三",8000.00, 2000.00, 5000.00, 10000.00)

    // 可不可以这样传参？
    val money = Array(2000.00, 5000.00, 10000.00)
//    totalSalay("张三",8000.00, money)   // 不可以
    // 使用  :_*  来逐个传入数组中的元素
    totalSalay("李四",8000.00, money:_*)   // 可以
  }
}
