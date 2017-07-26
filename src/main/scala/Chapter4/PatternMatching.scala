package Chapter4

/**
  * Created by Fraser on 17/07/2017.
  */
class PatternMatching {
  def lucky(num: Int ): String = num match{
    case 7 => "LUCKY NUMBER SEVEN!"
    case _ => "Sorry, you're out of luck, pal!"
  }

  def sayMe(num: Int): String = num match{
    case 1 => "One!"
    case 2 => "Two!"
    case 3 => "Three!"
    case 4 => "Four!"
    case 5 => "Five!"
    case _ => "Not between 1 and 5"
  }

  def factorial(num: Int):Int = num match{
    case 0 => 1
    case _ => num * factorial(num-1)
  }

  def charName(initial : Char): String = initial match{
    case 'a' => "Albert"
    case 'b' => "Broseph"
    case 'c' => "Cecil"
    case _ => "etc."
  }

/*  def addVectors(a:Vector[Int], b:Vector[Int]):Vector[Int] = a.length.toString match{
    case "0" => new Vector[Int]
    case "1" => new Vector[Int](a(0)+b(0))
    case "2" => new Vector[Int](a(0)+b(0))
    case _ => new Vector[Int](a(0)+b(0), a(1)+b(1), a(3)+b(3))
   }*/

  def myHead(list : List[Any]):Any = list.length match{
    case 0 => "empty list"
    case _ => list.head
  }

  def tell(list: List[Any]) :String = list match{
    case Nil => "the List is Empty"
    case a::Nil => "the List has 1 element " + a
    case a::b::Nil => "the list has two elements " + a + " and " + b
    case a::b::_ => "the list has many elements, initial are " + a + " and " + b
  }

  def myLength(list: List[Any]) :Int = list match {
    case Nil => 0
    case _::a => 1 + myLength(a)
  }

  def  mySum(list: List[Int]) :Int = list match{
    case Nil => 0
    case a::b => a + mySum(b)
  }
}
