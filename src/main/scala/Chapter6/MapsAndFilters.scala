package Chapter6

class MapsAndFilters {
  def addExclemationMarks(list: List[String]):List[String]={
    list.map(x => x + "!")
  }

  def squareContents(list : List[List[Int]]):List[List[Int]] ={
    list.map(x => x.map(_*2))
  }

  def greaterThan3(list:List[Int]):List[Int]={
    list.filter(_ > 3 )
  }

  def evens(list: List[Int]):List[Int]={
    list.filter(_%2 == 0)
  }

  def keepLowerCase(text: String):String ={
    text.filter(('a' to 'z').contains(_))
  }

  def sumOfOddSquaresSmallerThanTenThousand():Int ={
    val list = (1 to 10000).map(_*2).filter(_%2 != 0)
    list.sum
  }
}
