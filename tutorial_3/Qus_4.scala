package tutorial_3

object Qus_4 extends App {
  //calculate cost of total books
  def CalcCoverPriceCost(numofBooks: Int): Double = {
    val cover_cost = numofBooks * 24.95   //cover price for each book is 24.95
    
     cover_cost - (cover_cost * 0.4)   //substract the 40% discount value
  }

  //calculate shipping cost
  def CalcShippingCost(numofBooks: Int): Double = {
    if(numofBooks >= 50)
      50 * 3 + (numofBooks - 50) * 0.75   //first 50 book Rs.3 after 50 each book 75 cents
    else
      numofBooks * 3
  }

  //calculate total amount
  def TotalCost(numofBooks: Int): Double = CalcCoverPriceCost(numofBooks) + CalcShippingCost(numofBooks)

  val numofBooks = 60

  println(s"Total cost for $numofBooks books is ${TotalCost(numofBooks)}")
}
