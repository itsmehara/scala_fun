// FuturesExceptionExample.scala
import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object FuturesExceptionExample {
  def main(args: Array[String]): Unit = {
    val future = Future {
      throw new RuntimeException("Something went wrong!")
    }

    future.onComplete {
      case Success(value) => println(s"Future completed with value: $value")
      case Failure(exception) => println(s"Future failed with exception: $exception")
    }

    Await.result(future, 1.second)
  }
}
