// AkkaExample.scala
import akka.actor.typed.{ActorSystem, Behavior}
import akka.actor.typed.scaladsl.Behaviors

object AkkaExample {
  def main(args: Array[String]): Unit = {
    val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "AkkaExampleSystem")

    system.terminate()
  }
}
