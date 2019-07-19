class Calculator {
  def addNumbers(firstNo : Int, secondNo : Int) : Int = firstNo + secondNo
  def subtractNumbers(firstNo : Int, secondNo : Int) : Int = firstNo - secondNo
  def multiplyNumbers(firstNo : Int, secondNo : Int) : Int = firstNo * secondNo
  def divideNumbers(firstNo : Int, secondNo : Int) : Int = {
    require(secondNo!=0)
    firstNo / secondNo
  }
}
