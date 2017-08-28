/**
  * Created by Rodrigo Lima on 28/08/2017.
  */

object FriendlyNames {

  /**
    * input:
    * Seq("carr", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching")
    */

  def main(args: Array[String]) {
    def friendlyWords(words: Seq[String]): Seq[Seq[String]] = {
      val result =
        words
          .map(word => {
            words
              .map(w => w -> groupLetters(w))
              .filter(m => m._2 == groupLetters(word))
              .map(w => w._1)
          })
          .filter(x => x.length > 1)
          .distinct

      println(result)
      result
    }

    /**
      * This func creates a Map of letters and how many times it appears oi the word.
      * e.g  Rodrigo: Map(i -> 1, g -> 1, r -> 2, o -> 2, d -> 1)
      */
    def groupLetters(word: String): Map[Char, Int] = {
      word.groupBy(l => l).mapValues(_.length)
    }

    // Tests
    val seq = Seq("carr", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching")
    friendlyWords(seq)

    val seq2 = Seq("carr", "cheating", "dale", "listen", "deal", "lead", "silent", "teaching")
    friendlyWords(seq2)

    val seq3 = Seq("Rodrigo", "cheating", "dale", "listen", "deal", "lead", "silent", "teaching", " carr")
    friendlyWords(seq3)

    /**
      * output: Seq(Seq(cheating, teaching), Seq(dale, deal, lead), Seq(listen, silent))
      */
  }
}
