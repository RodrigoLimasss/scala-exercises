/**
  * Created by Rodrigo Lima on 18-Jun-16.
  */

object SimpleArraySum {

  /**
    * input:
    * 6 - array size
    * 1 2 3 4 10 11 - items array
    */

  def main(args: Array[String]) {

    import scala.io.StdIn._

    val n = readInt
    val ar = readLine.split(" ")
    var sum = 0

    (0 until n).foreach(x => {
      sum += ar(x).toInt
    })

    println(sum)

    /**
      * output: 31
      */

  }
}