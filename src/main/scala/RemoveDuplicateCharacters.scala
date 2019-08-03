object RemoveDuplicateCharacters {
  def main(args: Array[String]): Unit = {
    def removeDuplicateCharacters(str: String): String = {
      str.filter(i => str.count(_ == i) == 1)
        .mkString("")
    }
    println(removeDuplicateCharacters("abcddb"))
  }
}