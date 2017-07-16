def doubleComp(list:List[Int]):List[Int] ={
  for(i <- list) yield i*2
}


def doubleCompWithFileter(list:List[Int]):List[Int] ={
  for(i <- list if i*2 > 12) yield i*2
}

def sevenRemainderThree(list: List[Int]):List[Int] ={
  for(i <- list if i%7 == 3) yield i
}

def boomBang(list : List[Int]):List[String] = {
  for(i <- list if i%2 != 0) yield { if(i < 10)"boom" else "bang"}
}

def multipleConditions(list : List[Int]):List[Int] ={
  for(i <- list if i!=13 && i!=15 && i != 19) yield i
}

def multipleInputs(listA: List[Int], listB : List[Int]): List[Int] ={
  for(x <- listA; y <- listB) yield x*y
}

def addNounsAndAdjectives(nouns: List[String], adjectives : List[String]): List[String] ={
  for(x <- adjectives; y <- nouns) yield x+" "+y
}

def getLength(list : List[Any]): Int ={
  (for(x <- list) yield 1).sum
}

def multipleInputsWithCondition(listA: List[Int], listB : List[Int]): List[Int] ={
  for(x <- listA; y <- listB if x*y > 50) yield x*y
}

def removeLowercase(word :String):String ={
  for(x <- word if ('A' to 'Z').toList.contains(x)) yield x
}

def nestedListsGetEven(list :List[List[Int]]): List[List[Int]] ={
  for(xy <- list) yield{
    for(x <- xy if x%2 == 0) yield x
  }
}

println(doubleComp(List.range(1,11)))
println(doubleCompWithFileter(List.range(1,11)))
println(sevenRemainderThree(List.range(50,101)))
println(boomBang(List.range(7,14)))
println(multipleConditions(List.range(1,21)))
println(multipleInputs(List(2,5,10),List(8,10,11)))
println(addNounsAndAdjectives(List("hobo","frog","pop"),List("lazy","grouchy","scheming")))
println(multipleInputsWithCondition(List(2,5,10),List(8,10,11)))
println(removeLowercase("Hahaha! Ahahaha! "))
println(removeLowercase("IdontLIKEFROGS"))
println(nestedListsGetEven(List(List(1,3,5,2,3,1,2,4,5),List(1,2,3,4,5,6,7,8,9),List(1,2,4,2,1,6,3,1,3,2,3,6))))
println(getLength(List(1,2,3,4,5,6)))