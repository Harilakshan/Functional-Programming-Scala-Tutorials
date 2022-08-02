package tutorial_3

object Qus_2 extends App {
  def CelciustoFahrenite(temp: Double): Double = temp * 1.8 + 32

  val temp = 35.0d  //temperature value in celsius

  println(s"The temperature $temp in celsius is equal to ${CelciustoFahrenite(temp)} in fahrenite")
}
