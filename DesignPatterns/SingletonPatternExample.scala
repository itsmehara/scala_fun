// SingletonPatternExample.scala
object Singleton {
  private var instanceCount = 0

  def getInstance(): Singleton.type = {
    instanceCount += 1
    println(s"Instance count: $instanceCount")
    Singleton
  }

  def greet(): Unit = {
    println("Hello from Singleton!")
  }
}

object SingletonPatternExample {
  def main(args: Array[String]): Unit = {
    val singleton1 = Singleton.getInstance()
    singleton1.greet()

    val singleton2 = Singleton.getInstance()
    singleton2.greet()

    println(singleton1 == singleton2) // true, as they are the same instance
  }
}
