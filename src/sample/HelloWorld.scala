package sample

/**
 * Created by yamashiro-r on 15/03/20.
 */
object HelloWorld {
  def main(args: Array[String]) {
    helloWorld()
    number()
  }

  def helloWorld(): Unit = {
    println("hello world!!")
  }

  def number(): Unit = {
    val num:Int = 10
    println("num:" + num)
  }
}
