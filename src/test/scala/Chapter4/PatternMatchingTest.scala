package Chapter4

import org.scalatest._

class PatternMatchingTest extends FlatSpec with Matchers{
  val pattern = new PatternMatching()

  "Luckyy" should "return LUCKY NUMBER SEVEN! when passed 7" in {
    pattern.lucky(7)  shouldBe "LUCKY NUMBER SEVEN!"
  }

  it should "return Sorry, you're out of luck, pal! when passed 8" in {
    pattern.lucky(8)  shouldBe "Sorry, you're out of luck, pal!"
  }

  it should "return Sorry, you're out of luck, pal! when passed 13245" in {
    pattern.lucky(13245)  shouldBe "Sorry, you're out of luck, pal!"
  }

  "sayMe" should "return One! when passed 1" in {
    pattern.sayMe(1)  shouldBe "One!"
  }

  it should "return Four when passed 4" in {
    pattern.sayMe(4)  shouldBe "Four!"
  }

  it should "return Not between 1 and 5 when passed 13245" in {
    pattern.sayMe(13245)  shouldBe "Not between 1 and 5"
  }

  "factorial" should "return the factorial of 3" in{
    pattern.factorial(3) shouldBe 6
  }

  it should "return the factorial of 10" in{
    pattern.factorial(10) shouldBe 3628800
  }

  "charName" should "return Albert when passed a" in{
    pattern.charName('a') shouldBe "Albert"
  }

  it should "return Cecil when passed c" in{
    pattern.charName('c') shouldBe "Cecil"
  }

  it should "return etc. when passed g" in{
    pattern.charName('g') shouldBe "etc."
  }

  "myHead" should "return empty list when passed an empty list" in{
    pattern.myHead(List()) shouldBe "empty list"
  }

  it should "return 4 when passed List(4,6,8,6,3,2)" in {
    pattern.myHead(List(4,6,8,6,3,2)) shouldBe 4
  }

  "tell" should "return the list is empty when passed an empty list" in {
    pattern.tell(List()) shouldBe "the List is Empty"
  }

  it should "return the List has 1 element 4 passed List(4)" in {
    pattern.tell(List(4)) shouldBe "the List has 1 element 4"
  }

  it should "return the list is empty when passed an empty list(4,3)" in {
    pattern.tell(List(4, 3)) shouldBe "the list has two elements 4 and 3"
  }

  it should "return the list is empty when passed an List(4,3,2,1)" in {
    pattern.tell(List(4, 3, 2, 1)) shouldBe "the list has many elements, initial are 4 and 3"
  }

  "myLength" should "return 0 for an empty list" in{
    pattern.myLength(List()) shouldBe 0
  }

  it should "return 2 for a list with two elements" in{
    pattern.myLength(List(1,2)) shouldBe 2
  }

  "mySum" should "return 0 for an empty list" in {
    pattern.mySum(List()) shouldBe 0
  }

  it should "return 10 for List(1,2,3,4)" in {
    pattern.mySum(List(1,2,3,4)) shouldBe 10
  }
}
