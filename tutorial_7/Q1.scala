package tutorial_7

object Q1 extends App {
  val a = new Rational(5, 7)
  val b = new Rational(-2, 3)

  println(a.neg)
  println(b.neg)

}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def neg = new Rational(-this.numer, this.denom)

  override def toString(): String = numer + " / " + denom

}
