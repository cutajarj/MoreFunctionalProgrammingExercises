val numbs = List(5, 4, 6, 2, 8, 15, 7, 3, 10)

def findMin(min: Int, index: Int): Int = {
  if (index >= numbs.length)
    min
  else
    findMin(math.min(min, numbs(index)), index + 1)
}

findMin(Int.MaxValue, 0)

numbs.min

val names = List("James", "Mark", "Michelle")

def findMinStr(min: Int, index: Int): Int = {
    if (index >= names.length)
        min
    else
        findMinStr(math.min(min, names(index).length), index + 1)
}

findMinStr(Int.MaxValue, 0)

names.map(_.length).min

