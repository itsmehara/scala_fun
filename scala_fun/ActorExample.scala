// ActorExample.scala
import akka.actor.typed.{ActorSystem, Behavior}
import akka.actor.typed.scaladsl.Behaviors

object ActorExample {
  // Define a behavior for our actor
  val echoActor: Behavior[String] = Behaviors.receive { (context, message) =>
    context.log.info(s"Received message: $message")
    Behaviors.same
  }

  def main(args: Array[String]): Unit = {
    val system: ActorSystem[String] = ActorSystem(echoActor, "ActorExampleSystem")

    system ! "Hello, Actor!"
    system.terminate()
  }
}
