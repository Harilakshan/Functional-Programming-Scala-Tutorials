package tutorial_2

object Qus_4_B extends App {
  def getProfit(ticketprice: Int): Int = {
    val attendee = getAttendance(ticketprice)
    val profit = (attendee * ticketprice) - 500 - (attendee * 3)

    profit

  }

  def getAttendance(ticketprice: Int): Int = 120 - (((ticketprice - 15) / 5) * 20)

  val ticketpriceList: List[Int] = List(10, 15, 20, 25, 30, 35)
  val profitList: List[Int] = List(getProfit(ticketpriceList(0)), getProfit(ticketpriceList(1)), getProfit(ticketpriceList(2)), getProfit(ticketpriceList(3)), getProfit(ticketpriceList(4)), getProfit(ticketpriceList(5)))

  println(profitList)

}
