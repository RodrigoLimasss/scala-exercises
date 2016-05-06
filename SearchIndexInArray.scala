/**
  * Created by Rodrigo Lima on 05-May-16.
  */

object Solution {

  def main(args: Array[String]) {

    import scala.io.StdIn._

    val v = readInt
    val n = readInt
    val ar = readLine.split(" ")
    val array = new Array[Int](n)

    (0 until n).foreach(x => {
      array(x) = ar(x).toInt
    })

    println(array.indexOf(v))

  }
}