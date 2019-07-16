import org.scalatest.FunSuite
class CalculatorTest extends FunSuite {
  val calculatorObj = new Calculator
  test("Subtraction Test"){
    assert(-1 === calculatorObj.subtractNumbers(3,4))
    assert(0 === calculatorObj.subtractNumbers(6,6))
  }
  test("Addition Test"){
    assert(30 === calculatorObj.addNumbers(30,0))
    assert(-100 === calculatorObj.addNumbers(-200,100))
  }
  test("Multiplication Test"){
    assert(12 === calculatorObj.multiplyNumbers(3,4))
    assert(36 === calculatorObj.multiplyNumbers(6,6))
  }
  test("Division Test"){
    assert(5 === calculatorObj.divideNumbers(15,3))
    assert(1 === calculatorObj.divideNumbers(6,6))
  }
}
