package tutorial_3

object Qus_1 extends App {
    def CalcArea(radius: Double): Double =scala.math.Pi * radius * radius

    val radius = 5.0d

    println (s"Area of circle with radius $radius is ${CalcArea(radius)}")
}
