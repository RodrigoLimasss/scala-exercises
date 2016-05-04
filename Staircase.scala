/**
  * Created by Rodrigo Lima on 03-May-16.
  */
  
object Main extends App {
  
  def Staircase(n: Int) = {
    (1 to n).foreach(x => {
      println((" " * (n-x)) + ("#" * x))
    })
  }
  Staircase(6)
  
  /* output:
        #
       ##
      ###
     ####
    #####
   ######
 */
  
}
