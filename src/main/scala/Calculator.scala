class Calculator {
  def addNumbers(firstNo : Int, secondNo : Int) : Int = firstNo + secondNo
  def subtractNumbers(firstNo : Int, secondNo : Int) : Int = firstNo - secondNo
  def multiplyNumbers(firstNo : Int, secondNo : Int) : Int = firstNo * secondNo
  def divideNumbers(firstNo : Int, secondNo : Int) : Int = {
    require(secondNo!=0,"The denominator must be greater than 0.")
    firstNo / secondNo
  }
}
object Calculator extends App{
  val calculator = new Calculator
  println("1. Add\n2. Subtract\n3. Multiply\n4. Divide")
  val n : Int = 4
  n match {
    case 1 => println("Result : "+calculator.addNumbers(20,10))
    case 2 => println("Result : "+calculator.subtractNumbers(20,40))
    case 3 => println("Result : "+calculator.multiplyNumbers(20,10))
    case 4 => println("Result : "+calculator.divideNumbers(20,10))
    case default => println("Contains only 4 operations.")
  }
}