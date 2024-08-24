// ReferentialTransparencyExample.scala
object ReferentialTransparencyExample {
  // Pure function
  def square(x: Int): Int = x * x

  def main(args: Array[String]): Unit = {
    val num = 4
    val result1 = square(num)
    val result2 = square(num)  // Referential transparency: same input always yields same result

    println(s"Result 1: $result1")
    println(s"Result 2: $result2")
  }
}
