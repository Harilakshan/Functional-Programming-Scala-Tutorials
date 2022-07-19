package tutorial_3

object Qus_4 extends App {
  //calculate cost of total books
  def TotalCostforBooks(numofBooks: Int): Double = {
    val cost = numofBooks * 24.95
    return cost - (cost * 0.4)
  }

  //calculate shipping cost
  def CalcShippingCost(numofBooks: Int): Double = {
    if(numofBooks >= 50)
      50 * 3 + (numofBooks - 50) * 0.75
    else
      numofBooks * 3
  }

  //calculate total amount
  def TotalAmount(numofBooks: Int): Double = TotalCostforBooks(numofBooks) + CalcShippingCost(numofBooks)

  val numofBooks = 60

  println(s"Total cost for $numofBooks books is ${TotalAmount(numofBooks)}")
}
