package tutorial_6

object Q1 extends App {
  //Cipher function for choose encryption and decryption functions
  def Cipher(number: Int): Unit = number match {
    case x if x == 0 => Encryption()
    case x if x == 1 => Decryption()
  }

  //Encryption function for caesar cipher
  def Encryption(): Unit = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    print("Enter the number of shifts : ")
    val shift = scala.io.StdIn.readInt()

    print("Enter the secret message : ")
    val message = scala.io.StdIn.readLine()

    val outputMessage = message.map((character: Char) => {
      val a = alphabet.indexOf(character.toUpper)

      if(a == -1) {
        character
      }
      else if (a - shift < 0) {
        alphabet((alphabet.size + (a - shift)))
      }
      else {
        alphabet((a + shift) % alphabet.size)                                 //alphabet.size = 26
      }
    })
    println(s"The encrypted message is ${outputMessage}")
  }

  //Decryption function for caesar cipher
  def Decryption(): Unit = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    print("Enter the number of shifts : ")
    val shift = scala.io.StdIn.readInt()

    print("Enter the secret message : ")
    val message = scala.io.StdIn.readLine()

    val outputMessage = message.map((character: Char) => {
      val a = alphabet.indexOf(character.toUpper)

      if (a == -1) {
        character
      }
      else if(a - shift < 0){
        alphabet((alphabet.size + (a - shift)))
      }
      else {
        alphabet((a - shift) % alphabet.size)                                       //alphabet.size = 26
      }
    })
    println(s"The decrypted message is ${outputMessage}")
  }

  print("Enter the option(0 for encryption or 1 for decryption) : ")
  var option = scala.io.StdIn.readLine().toInt

  Cipher(option)
}
