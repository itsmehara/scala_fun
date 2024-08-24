// PureFunctionsExample.scala
object PureFunctionsExample {
  // Pure function: same inputs always produce the same output, no side effects
  def add(x: Int, y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    println(add(5, 3)) // 8
    println(add(5, 3)) // 8 (same result as before)
  }
}
