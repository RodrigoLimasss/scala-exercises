/**
  * Created by Rodrigo Lima on 05-May-16.
  */

object SearchIndexInArray {

  /**
    input:
    4 - value
    6 - array size
    1 4 5 7 9 12 - items array
  */

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

    /**
      output: 1
    */

  }
}