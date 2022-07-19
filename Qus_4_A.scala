package tutorial_2

object Qus_4_A extends App {
  def main(args: Array[String]): Unit = {
    println("The take home salary for 40 Normal hours and 30 OT hours is " +
      calcTakehomeSal(calcTotal(30, 40), calcTax(calcTotal(30, 40)))
      + ".")
  }

  def calcTotal(x: Int, y: Int): Double = calcOTHourSal(x) + calcNormalHour(y)

  def calcNormalHour(n: Int): Double = n * 250.0

  def calcOTHourSal(n: Int): Double = n * 85.0

  def calcTax(wage: Double): Double = wage * 12.0 / 100

  def calcTakehomeSal(salary: Double, tax: Double): Double = salary - tax
}
