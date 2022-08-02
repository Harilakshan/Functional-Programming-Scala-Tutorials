package tutorial_2

object Qus_4_A extends App {
  def CalcInitialSalary(workHour: Int, overtimeHour: Int): Double = 250.0d * workHour + 85.0d * overtimeHour
  def CalcTax(workHour: Int, overtimeHour: Int): Double =
    if(workHour >= 40 && overtimeHour >= 30)
      CalcInitialSalary(workHour, overtimeHour) * 0.12
    else 0

  def CalcTakeHomeSalary(workHour: Int, overtimeHour: Int): Double = CalcInitialSalary(workHour, overtimeHour) - CalcTax(workHour, overtimeHour)

  print("Enter working hour of employee: ")
  val workHour = scala.io.StdIn.readInt()

  print("Enter over time of employee: ")
  val overtimeHour = scala.io.StdIn.readInt()

  val finalSalary = CalcTakeHomeSalary(workHour, overtimeHour)


    println(s"The take home salary is Rs.$finalSalary")
}
