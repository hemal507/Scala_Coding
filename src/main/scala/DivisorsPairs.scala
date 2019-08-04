object DivisorsPairs {
  def main(args: Array[String]): Unit = {
      def divisorsPairs(sequence: Array[Int]): Int = (for {x <- sequence; y <- sequence if y != x && y % x == 0} yield (x, y)).length
      println(divisorsPairs(Array(1,3,2)))
      println(divisorsPairs(Array(2,4,8)))
    }
}



