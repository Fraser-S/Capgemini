println(Tuple2(8,11)._1)
println(Tuple2("Wow",false)._1)

println(Tuple2(8,11)._2)
println(Tuple2("Wow",false)._2)

println(List(1,2,3,4).zip(List(5,6,7,8)))
println(List.range(1,6).zip(List("one","two","three","four","five")))

println(List(5,3,2,6,2,7,2,5,4,6,6).zip(List("im","a","turtle")))

def rightTriangles() : List[Any] = {
  for(c <- List.range(1,11); b <- List.range(1,c); a <- List.range(1,b) if a*a + b*b == c*c) yield (a,b,c)
}


def rightTrianglesCheckPerimiter(per : Int) : List[Any] = {
  for(c <- List.range(1,11); b <- List.range(1,c); a <- List.range(1,b) if a*a + b*b == c*c && a+b+c == per) yield (a,b,c)
}

println(rightTriangles())
println(rightTrianglesCheckPerimiter(24))