package Chapter3
/**
  * Created by Fraser on 20/07/2017.
  */

import org.scalatest._

class TypesAndClassesTest extends FlatSpec with Matchers{
  val types = new TypesAndClasses()

  "Check Type" should "return 'String' when passed a string" in {
    types.checkType("a string")  shouldBe "String"
  }

  it should "return 'Char' when passed a Char" in {
    types.checkType('d')  shouldBe "Char"
  }

  it should "return 'Int' when passed an int" in {
    types.checkType(143)  shouldBe "Int"
  }

  it should "return 'Float' when passed a float" in {
    types.checkType(143.6f)  shouldBe "Float"
  }

  it should "return 'Double' when passed a double" in {
    types.checkType(123.67)  shouldBe "Double"
  }

  it should "return 'boolean' when passed a boolean" in {
    types.checkType(true)  shouldBe "Boolean"
  }

  it should "return '\"Type not in statement\"' when passed a type that's npt in the statement" in {
    types.checkType(1239413L) shouldBe "Type not in statement"
  }

  "show" should "return an '4232345.0' when passed 4232345f" in {
    val num:Float = 4232345f
    types.show(num) shouldBe "4232345.0"
  }

  "show" should "return an 'true' when passed true" in {
    val con:Boolean = true
    types.show(con) shouldBe "true"
  }

}
