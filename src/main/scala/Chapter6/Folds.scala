package Chapter6

class Folds {
  def sum(list: List[Int]): Int = {
    list.foldRight(0)((acc: Int, element:Int) => acc + element)
  }

  def maximum(list: List[Int]): Int ={
    list.foldRight(0)((acc: Int, curr:Int) => if (curr > acc) curr else acc)
  }

  def scanRightAdd(list:List[Int]):List[Int] ={
    list.scanRight(0)(_+_)
  }

  def scanRightSubtract(list:List[Int]):List[Int] ={
    list.scanRight(0)(_-_)
  }

  def scanLeftAdd(list:List[Int]):List[Int] ={
    list.scanLeft(0)(_+_)
  }

  def scanLeftSubtract(list:List[Int]):List[Int] ={
    list.scanLeft(0)(_-_)
  }
}