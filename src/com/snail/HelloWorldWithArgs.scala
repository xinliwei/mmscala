package com.snail

/**
  * Created by tongyao on 2021-07-08.
  *
  * 可从命令行传参
  */
object HelloWorldWithArgs extends App{
  println("Hello World!")
  println(args.mkString(","))
}
