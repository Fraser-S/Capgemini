package Chapter3


/**
  * Created by Fraser on 20/07/2017.
  */
class TypesAndClasses {

  def checkType(value : Any): String = value match{
    case _: Int => "Int"
    case _: Float => "Float"
    case _: Double => "Double"
    case _: Char => "Char"
    case _: Boolean => "Boolean"
    case _: String => "String"
    case _ => "Type not in statement"
  }

  def show(a :Any): String ={
    a.toString
  }
}
