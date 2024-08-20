// PatternMatchingExample.scala
case class Person(name: String, age: Int)

object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    val person = Person("Alice", 30)

    person match {
      case Person("Alice", age) if age > 20 => println("Alice is older than 20.")
      case Person(name, _) => println(s"Person's name is $name.")
    }
  }
}
