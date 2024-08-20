// InheritanceExample.scala
class Animal(val name: String) {
  def speak(): Unit = {
    println(s"$name makes a sound.")
  }
}

class Dog(name: String) extends Animal(name) {
  override def speak(): Unit = {
    println(s"$name barks.")
  }
}

object InheritanceExample {
  def main(args: Array[String]): Unit = {
    val dog = new Dog("Rover")
    dog.speak()
  }
}
