// ImmutableDataStructuresExample.scala
object ImmutableDataStructuresExample {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val newList = list.map(_ * 2)

    println(s"Original List: $list")
    println(s"New List: $newList")
  }
}
