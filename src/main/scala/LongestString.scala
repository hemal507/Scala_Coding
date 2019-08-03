object LongestString {
  def longestString(inputArray: Array[String]): String = {
    var m = ""
    for (x <- inputArray) if (x.length() > m.length()) m = x
    m
  }
}