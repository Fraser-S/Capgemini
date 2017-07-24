package Chapter3
/**
  * Created by Fraser on 20/07/2017.
  */

import org.scalatest._

class TypesAndClassesTest extends FlatSpec with Matchers{
  val types = new TypesAndClasses()

  "Check Type" should "return 'string' when passed a string" in {
    types.checkType("a string")  shouldBe "string"
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

  it should "return '\"Type not in statement\"' when passed a type thats npt in the statement" in {
    types.checkType(1239413L) shouldBe "Type not in statement"
  }
}
