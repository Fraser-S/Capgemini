package Chapter6

class Currying {
  def max(x:Int)(y:Int):Int ={
    if(x>y) x else y
  }

  def multThree(x:Int)(y:Int)(z:Int):Int={
    x*y*z
  }

  def multTwoWith9 = multThree(9)
}
