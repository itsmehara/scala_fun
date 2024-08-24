// FactoryPatternExample.scala
trait Animal {
  def makeSound(): Unit
}

class Dog extends Animal {
  override def makeSound(): Unit = println("Woof!")
}

class Cat extends Animal {
  override def makeSound(): Unit = println("Meow!")
}

object AnimalFactory {
  def createAnimal(animalType: String): Animal = animalType match {
    case "dog" => new Dog
    case "cat" => new Cat
    case _ => throw new IllegalArgumentException("Unknown animal type")
  }
}

object FactoryPatternExample {
  def main(args: Array[String]): Unit = {
    val dog = AnimalFactory.createAnimal("dog")
    dog.makeSound()

    val cat = AnimalFactory.createAnimal("cat")
    cat.makeSound()
  }
}
