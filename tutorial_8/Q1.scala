package tutorial_8

object Q1 extends App {
  var a = Point(2, 4)
  var b = Point(-2,-6)

  println("Sum of the given two points is " + a.add(b))

  a.move(x1 = 3, y1 = 4)
  println("new point after moving is " + a)

  var c = a.distance(b)
  println("The distance between two given points is " + c)

  a.invert()
  println("The new point after inverting is " + a)

}

case class Point(var x: Int, var y: Int) {
  def add(a: Point) = new Point(this.x + a.x, this.y + a.y)

  def move(x1: Int, y1: Int) : Unit = {
    this.x = this.x + x1
    this.y = this.y + y1
  }

  //distance between (x1,y1), (x2,y2) = [(x1-x2)^2 + (y1-y2)^2]^(1/2)
  def distance(a: Point) : Double = {
    var xdist: Int = this.x - a.x
    var ydist: Int = this.y - a.y
    var dist = xdist * xdist + ydist * ydist
    scala.math.sqrt(dist)
  }

  def invert(): Unit = {
    var tmp = this.x
    this.x = this.y
    this.y = tmp
  }
}
