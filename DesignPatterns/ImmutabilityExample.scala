// ImmutabilityExample.scala
object ImmutabilityExample {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    val newList = list :+ 4
    
    println(s"Original list: $list")
    println(s"New list: $newList")
  }
}
