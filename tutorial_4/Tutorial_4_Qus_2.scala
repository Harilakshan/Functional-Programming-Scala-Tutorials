package tutorial_4

object Tutorial_4_Qus_2 extends App {

  def CheckNumber(number: Int): Unit = number match {
    case x if(x <= 0 && x % 2 == 0) => println(s"Number ${number} is Negative/Zero and Even.")
    case x if(x <= 0 && x % 2 != 0) => println(s"Number ${number} is Negative/Zero and Odd.")
    case x if(x > 0 && x % 2 == 0) => println(s"Number ${number} is Positive and Even.")
    case x => println(s"Number ${number} is Positive and Odd.")
  }

  printf("Enter the number to check: ");
  val number = scala.io.StdIn.readInt()

  println()

  CheckNumber(number)
}
