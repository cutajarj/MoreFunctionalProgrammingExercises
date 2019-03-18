val numbs = List(5, 4, 6, 2, 8, 15, 7, 3, 10)

numbs.foldLeft(Int.MaxValue){ (min, item) =>
  math.min(min, item)
}

val names = List("James", "Mark", "Michelle")

names.foldLeft(("", Int.MaxValue)){ (min, item) =>
  if (min._2 < item.length) min
  else (item, item.length)
}

