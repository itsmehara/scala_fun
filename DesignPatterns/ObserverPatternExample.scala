// ObserverPatternExample.scala
import scala.collection.mutable

trait Observer {
  def update(message: String): Unit
}

class Subject {
  private val observers = mutable.ListBuffer[Observer]()

  def addObserver(observer: Observer): Unit = {
    observers += observer
  }

  def notifyObservers(message: String): Unit = {
    observers.foreach(_.update(message))
  }
}

class ConcreteObserver(name: String) extends Observer {
  override def update(message: String): Unit = {
    println(s"$name received message: $message")
  }
}

object ObserverPatternExample {
  def main(args: Array[String]): Unit = {
    val subject = new Subject
    val observer1 = new ConcreteObserver("Observer1")
    val observer2 = new ConcreteObserver("Observer2")

    subject.addObserver(observer1)
    subject.addObserver(observer2)

    subject.notifyObservers("Hello Observers!")
  }
}
