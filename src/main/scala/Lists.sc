val lostNumbers = List(4,8,15,16,23,42)

println(lostNumbers)

val anotherList = List(45, 50, 53)
val combinedList = lostNumbers:::anotherList

println(combinedList)

val extendedList = 1+:lostNumbers

println("Steve Buscemi"(3))

def greaterThanLists(listA : List[Int], listB : List[Int]): Boolean ={
  def iter(i : Int): Boolean = i match{
    case a if i == listA.length => false //returns false if the list is the same or shorter
    case b if i == listB.length => true //returns true if listA is larger
    case c if listA(i) > listB(i) => true //element is larger return true
    case d if listA(i) < listB(i) => false //element is smaller return false
    case _ => iter(i+1) //same check the next field
  }
  iter(0)
}

//test the function[3,2,1] > [2,1,0]
println(greaterThanLists(List(3,2,1),List(2,1,0)))
println(greaterThanLists(List(3,2,1),List(2,10,100)))
println(greaterThanLists(List(3,4,2),List(3,4)))
println(greaterThanLists(List(3,2,1),List(2,4)))
println(List(3,4,2) == List(3,4,2))

//basic functions
println(lostNumbers + "\n")
println(lostNumbers.head)
println(lostNumbers.tail)
println(lostNumbers.last)
println(lostNumbers.init)
println(lostNumbers.length)
println(lostNumbers.drop(3))
println(lostNumbers.drop(0))
println(lostNumbers.drop(100))
println(lostNumbers.max)
println(lostNumbers.min)
println(lostNumbers.sum)
println(lostNumbers.product)
println(lostNumbers.contains(42))
println(lostNumbers.contains(43))

//list ranges
val listRange:List[Int] = List.range(1, 20)
println(listRange)
val listRangeWithStep:List[Int] = List.range(1, 20,2)
println(listRangeWithStep)
println(('a' to 'z').toList)


//does'nt work for strings
def cycle(list : List[Any], timesToLoop: Int): List[Any] ={
  def iter(i : Int): List[Any] = i match{
    case a if i == timesToLoop => List()
    case _ => list(i%list.length)::iter(i+1)
  }
  iter(0)
}

//test the function
println(cycle(List(1,2,3),10))

def repeat(a : Any, timesToRepeat: Int) = {
  def iter(i : Int): List[Any] = i match{
    case a if i == timesToRepeat => List()
    case _ => a::iter(i+1)
  }
  iter(0)
}

//test the function
println(repeat(5, 10))