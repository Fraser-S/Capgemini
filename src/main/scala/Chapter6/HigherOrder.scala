package Chapter6

class HigherOrder {
  def applyTwice(f : Int=>Int, num: Int):Int ={
    f(f(num))
  }

  /*def zipWith(f : List[Int]=>List[Int]=>List[Int], listA:List[Int], listB : List[Int]) :List[Int] ={
    f(listA,listB)
  }*/

  def flip[a, b, c]: (a => b => c) => b => a => c = {
    case f => x => y => f(y)(x)
  }
}
