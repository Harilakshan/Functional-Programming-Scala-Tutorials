package tutorial_3

object Qus_5 extends App {
  def GetEasytime(distance: Double): Double = 8 * distance   //easy = 8 min/km

  def GetTempotime(distance: Double): Double = 7 * distance  //tempo = 7 min/km

  println(s"Total running time is ${GetEasytime(2) + GetTempotime(3) + GetEasytime(2)} minutes")
}
