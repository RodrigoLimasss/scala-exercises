/**
  * Created by Rodrigo Lima on 03-May-16.
  */

object Staircase {

  /**
    input: 6
  */

  def main(args: Array[String]) {

    import scala.io.StdIn._

    val v = readInt

    def Staircase(n: Int) = {
      (1 to n).foreach(x => {
        println((" " * (n - x)) + ("#" * x))
      })
    }
    Staircase(v)

    /**
      output:
              #
             ##
            ###
           ####
          #####
         ######
   */

  }
}
