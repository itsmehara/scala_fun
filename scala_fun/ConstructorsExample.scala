// ConstructorsExample.scala
class Rectangle(val width: Int, val height: Int) {
  def area(): Int = width * height
}

object ConstructorsExample {
  def main(args: Array[String]): Unit = {
    val rectangle = new Rectangle(5, 10)
    println(s"Area of rectangle: ${rectangle.area()}")
  }
}
