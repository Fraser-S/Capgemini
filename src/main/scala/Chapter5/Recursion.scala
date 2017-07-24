package Chapter5

class Recursion {
  def maximum(list: List[Int], max: Int): Int = list match{
    case a if list.length == 0 => max;
    case b if list.head > max => maximum(list.tail, list.head)
    case _ => maximum(list.tail, max)
  }

  def replicate(timesToDuplicate: Int, element: Any):List[Any] = timesToDuplicate match{
    case 0 => List()
    case _ => List(element)::replicate(timesToDuplicate-1,element)
  }

  def take(list: List[Any], amountToTake: Int):List[Any] = amountToTake match{
    case stop if amountToTake == 0 || list.isEmpty => List()
    case _ => list.head::take(list.tail, amountToTake-1)
  }

  def reverse(list: List[Any]):List[Any] = list.length match{
    case 0 => List()
    case _ => list.last::reverse(list.init)
  }

  def zip(listA: List[Int], listB: List[Int]): List[List[Int]] = {
    case stop if listA.isEmpty || listB.isEmpty => List(List())
    case _ => List(List(listA.head,listB.head))::zip(listA.tail,listB.tail)
  }

  def elem(list : List[Any], element: Any):Boolean = list match{
    case exit if list.isEmpty => false
    case a if list.head == element => true
    case _ => elem(list.tail, element)
  }

  def quickSort(list: List[Int]): List[Int] = list match{
    case stop if list.isEmpty => List()
    case _ => {
      val smallerList: List[Int] = quickSort(for(x <- list.tail if (x <= list.head)) yield x)
      val largerList: List[Int] = quickSort(for(x <- list.tail if (x > list.head)) yield x)
        smallerList:::list.head::largerList
    }
  }
}
