package tutorial_2

object Qus_4_B extends App{
  def CalcCost(args: Array[String]) = {
    print(totalCost(10), totalCost(15), totalCost(20), totalCost(25), totalCost(30), totalCost(35))
  }

  def calcAttendeeCost(n: Int) = n * 3

  def calcAttendence(ticketPrice: Int): Int = 120 + (15 - ticketPrice) * 4

  def totalSales(ticketPrice: Int): Double = {
    calcAttendence(ticketPrice) * ticketPrice
  }

  def totalCost(ticketPrice: Int): Double = {
    calcAttendeeCost(calcAttendence(ticketPrice)) + 500
  }
}
