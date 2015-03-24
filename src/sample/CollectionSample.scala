package sample

/**
 * Created by yamashiro-r on 15/03/24.
 */
object CollectionSample {
  def main(args: Array[String]) {
    list
    map
    tuple
    ifElse
    forLoop
  }

  def list: Unit = {
    // Listを宣言
    val list = List(1)
    println(list)

    // listの先頭に2を追加
    val list2 = 2 :: list
    println(list2)

    // list2の最後に3を追加
    val list3 = list2 :+ 3
    println(list3)
  }

  def map: Unit = {
    // Mapを宣言
    val map = Map[Int, String](1 -> "hello")
    println(map)

    // Key:1の値を取得
    println(map(1))

    // 値を追加
    val map2 = map.+(2 -> "world!!")
    println(map2)
  }

  def tuple: Unit = {
    // タプルを宣言
    val tuple = (1, "hello")
    println(tuple)

    // 1番目の要素
    println(tuple._1)

    // 2番目の要素
    println(tuple._2)
  }

  def ifElse: Unit = {
    val x = 0

    // valueにif文の結果を代入
    val value = if (x > 0) {
      "(x > 0) is true"
    } else {
      "(x > 0) is false"
    }

    println(value)
  }

  def forLoop: Unit = {
    // 宣言したListをfor文でiteration
    for (item <- List("scala", "java", "JavaScript")) {
      println(item)
    }
  }

}
