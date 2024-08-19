// ThreadsExample.scala
object ThreadsExample {
  def main(args: Array[String]): Unit = {
    val thread1 = new Thread(() => {
      for (i <- 1 to 5) {
        println(s"Thread 1: $i")
        Thread.sleep(1000)
      }
    })

    val thread2 = new Thread(() => {
      for (i <- 1 to 5) {
        println(s"Thread 2: $i")
        Thread.sleep(500)
      }
    })

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()
  }
}
