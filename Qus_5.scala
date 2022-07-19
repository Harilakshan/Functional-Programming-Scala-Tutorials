package tutorial_3

object Qus_5 extends App {
  def GetEasytime(distance: Double): Double = 8 * distance

  def GetTempotime(distance: Double): Double = 7 * distance

  println(s"Total running time is ${GetEasytime(2) + GetTempotime(3) + GetEasytime(2)}")
}
