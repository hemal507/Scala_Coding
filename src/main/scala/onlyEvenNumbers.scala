def onlyEvenNumbers(left: Int, right: Int): Array[Int] = {
    left to right filter (_ % 2 == 0) toArray
}

def onlyEvenNumbers(l: Int, r: Int) = l to r filter (_ % 2 == 0) toArray

