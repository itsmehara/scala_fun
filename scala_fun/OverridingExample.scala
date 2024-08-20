// OverridingExample.scala
class Vehicle {
  def move(): Unit = {
    println("Vehicle is moving.")
  }
}

class Car extends Vehicle {
  override def move(): Unit = {
    println("Car is driving.")
  }
}

object OverridingExample {
  def main(args: Array[String]): Unit = {
    val vehicle: Vehicle = new Car()
    vehicle.move()
  }
}
