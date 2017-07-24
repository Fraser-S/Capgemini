package Chapter4

class Guards {
  def bmiTell(weight : Float, height: Float):String = {
    val bmi = weight / height * height
    bmi match {
      case a if bmi <= 18.5 => "You're underweight, you emo, you!"
      case b if bmi <= 25.0 => "You're supposedly normal. Pffft, I bet you're ugly!"
      case c if bmi <= 30.0 => "You're fat! Lose some weight, fatty!"
      case _ => "You're a whale, congratulations!"
    }
  }

  def max(a: Int, b:Int): Int = a match{
    case x if a > b => a
    case _ => b
  }
}
