
val list1 = List(2,4,6,8,9) //left
val list2 = List(1,3,7,10,11) //right

(0 until list1.length + list2.length).toList
//(0 until list1.length + list2.length).foldLeft

def merge(left:List[Int], right:List[Int]): List[Int] = {
  val output = (0 until left.length + right.length)
    .foldLeft(List[Int](), left, right) { (triple, _) =>
      val (merged, leftRemaining, rightRemaining) = triple
      (leftRemaining, rightRemaining) match {
        case (Nil, r :: rTail) => (r :: merged, Nil, rTail)
        case (l :: lTail, Nil) => (l :: merged, lTail, Nil)
        case (l :: lTail, r :: rTail) if l < r => (l :: merged, lTail, rightRemaining)
        case (l :: lTail, r :: rTail) => (r :: merged, leftRemaining, rTail)
      }
    }
  output._1.reverse
}

merge(list1, list2)

