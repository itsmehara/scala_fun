// TraitsMixinsExample.scala
trait Flyable {
  def fly(): Unit = {
    println("I can fly!")
  }
}

class Bird extends Flyable {
  def chirp(): Unit = {
    println("Chirp chirp!")
  }
}

object TraitsMixinsExample {
  def main(args: Array[String]): Unit = {
    val bird = new Bird()
    bird.fly()
    bird.chirp()
  }
}
