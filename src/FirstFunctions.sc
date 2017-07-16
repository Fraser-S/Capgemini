def doubleMe(x: Double):Double ={
   x + x
}

//test the function
println(doubleMe(9))
println(doubleMe(8.3))

def doubleUs(x: Double, y:Double):Double ={
  doubleMe(x) + doubleMe(y)
}

//test the function
println(doubleUs(4, 9))
println(doubleUs(2.3, 34.2))

//test both in same use
println(doubleUs(28, 88) + doubleMe(123))


def doubleSmallNumber(x : Double):Double ={
  if(x > 100) x else doubleMe(x)
}

//test the function
println(doubleSmallNumber(101))
println(doubleSmallNumber(5.3))

def doubleSmallNumberPlus1(x : Double):Double ={
  (if(x > 100) x else doubleMe(x)) + 1
}

//test the function
println(doubleSmallNumberPlus1(101))
println(doubleSmallNumberPlus1(5.3))