// ActorCommunicationExample.scala
import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.Behaviors

object ActorCommunicationExample {
  // Define the messages
  sealed trait Message
  case class Greet(name: String, replyTo: ActorRef[Response]) extends Message
  case class Response(greeting: String) extends Message

  // Define the actors
  val greeter: Behavior[Greet] = Behaviors.receive { (context, message) =>
    context.log.info(s"Greeter received message: $message")
    message.replyTo ! Response(s"Hello, ${message.name}!")
    Behaviors.same
  }

  val responder: Behavior[Response] = Behaviors.receive { (context, message) =>
    context.log.info(s"Responder received message: ${message.greeting}")
    Behaviors.same
  }

  def main(args: Array[String]): Unit = {
    val system: ActorSystem[Message] = ActorSystem(greeter, "ActorCommunicationSystem")
    val responderRef: ActorRef[Response] = system.systemActorOf(responder, "ResponderActor")

    system ! Greet("World", responderRef)
    system.terminate()
  }
}
