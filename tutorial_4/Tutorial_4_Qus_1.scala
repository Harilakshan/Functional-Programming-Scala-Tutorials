package tutorial_4

object Tutorial_4_Qus_1 extends App {
 def CalcInterest(deposit: Double): Double = deposit match {
   case x if (x > 2000000) => (x * 6.5 / 100)    //6.5% flat for more than 2000000 Rs
   case x if (x > 200000) => (x * 3.5 / 100)     //3.5% flat for less than 2000000 Rs
   case x if (x > 20000) => (x * 4 / 100)        //4% flat for less than 200000 Rs
   case x => (x * 2 / 100)                       //2% flat for less than 20000 Rs
 }

  print("Enter the deposit amount : ")
  val deposit = scala.io.StdIn.readInt()  //get deposit reading from console

  println(s"The interest amount for ${deposit} is ${CalcInterest(deposit)} rupees")

}
