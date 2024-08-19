// FuturesExample.scala
import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FuturesExample {
  def main(args: Array[String]): Unit = {
    val future1 = Future {
      Thread.sleep(1000)
      "Result from future 1"
    }

    val future2 = Future {
      Thread.sleep(500)
      "Result from future 2"
    }

    val combinedFuture = for {
      result1 <- future1
      result2 <- future2
    } yield s"$result1 and $result2"

    println(Await.result(combinedFuture, 2.seconds))
  }
}
