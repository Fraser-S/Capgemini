package Chapter4

class Let {
  def cylinder(pi: Float, radius: Float, height: Float):Float ={
    lazy val sideArea:Float = 2*pi*radius*height
    lazy val topArea:Float = pi*radius*2
    sideArea + (2*topArea)
  }
}

