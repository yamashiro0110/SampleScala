package sample

/**
 * Created by yamashiro-r on 15/03/24.
 */
object FunctionSample {

  def main(args: Array[String]) {
    caseSample
    functionObject
    valiableLength
    defaultArgs()
  }

  def caseSample: Unit = {
    val x = 10

    x match {
      case 1 => {
        println("xは1")
      }
      case x:Int if (x > 10) => {
        println("xはInt型かつ10以上")
      }
      case 10 => {
        println("xは10")
      }
      case _ => {
        println("該当なし")
      }
    }
  }

  def functionObject: Unit = {
    val func = (x:Int, y:Int) => {"x + y = " + (x + y)}
    println(func(2, 3))
  }

  def valiableLength: Unit = {
    valiableLength("hoge", "fuga")
  }

  def valiableLength(args : String*): Unit = {
    for (arg <- args) {
      println(arg)
    }
  }

  def defaultArgs(msg:String = "msg is default", num:Int = 1): Unit = {
    println("msg:" + msg + " num:" + num)
  }

}
