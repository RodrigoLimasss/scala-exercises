/**
  * Created by Rodrigo Lima on 18-Jun-16.
  */

object VeryBigSum {

  /**
    * input:
    * 1000000001 1000000002 1000000003 1000000004 1000000005 - items array
    */

  def main(args: Array[String]) {

    import scala.io.StdIn._

    val array = readLine.split(" ")

    val total: Long = array.map(_.toLong).sum

    println(total)

    /**
      * output: 5000000015
      */
  }
}