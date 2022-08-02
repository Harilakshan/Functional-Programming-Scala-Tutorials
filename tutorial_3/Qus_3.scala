package tutorial_3

object Qus_3 extends App {
  def CalcVolume(radius: Double): Double = (4.0d / 3.0d) * scala.math.Pi * radius * radius

  val radius = 5.0d
  println(s"The volume of sphere with radius $radius is ${CalcVolume(radius)}")
}

