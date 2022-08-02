package tutorial_4

object Tutorial_4_Qus_3 extends App {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String)(indexList: Int*)(func: String => String): String = {
    if(indexList.isEmpty)
    {
        return func(name)
    }

    var temp = ""                                           //temporary string
    var i = 0
    while(i < name.length())
    {
      if(indexList.contains(i))
      {
           temp = temp + func(name.charAt(i).toString)
      }
      else
      {
        temp = temp + name.charAt(i).toString
      }
      i = i + 1
    }
    temp
  }

    println(formatNames("Benny")()(toUpper))                 //output will be BENNY
    println(formatNames("Saman")()(toLower))                 //output will be saman
    println(formatNames("Niroshan")(0,1)(toUpper))  //output will be NIroshan
    println(formatNames("Kumara")(5)(toUpper))      //output will be KumarA
}
