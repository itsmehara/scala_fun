// ObjectDefinitionExample.scala
object MathUtils {
  def add(x: Int, y: Int): Int = x + y
  def subtract(x: Int, y: Int): Int = x - y
}

object ObjectDefinitionExample {
  def main(args: Array[String]): Unit = {
    println(s"Addition: ${MathUtils.add(5, 3)}")
    println(s"Subtraction: ${MathUtils.subtract(5, 3)}")
  }
}
