package tutorial_4

object Tutorial_4_Qus_3 {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String)(func: String => String)(indexlist: Int*): String = {
    if(indexlist.isEmpty)
    {
        return func(name)
    }

    var temp = " "
    var i = 0
    while(i < name.length())
    {
      if(indexlist.contains(i))
      {
           temp = temp + func(name.charAt(i).toString)
      }
      else
      {
        temp = temp + name.charAt(i).toString
        i = i + 1
      }
    }
    temp
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper)())
    println(formatNames("Saman")(toLower)())
    println(formatNames("Niroshan")(toUpper)(0,1))
    println(formatNames("Kumara")(toUpper)(5))
  }
}
