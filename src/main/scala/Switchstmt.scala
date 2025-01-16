object Switchstmt {

  def main(args:Array[String]):Unit={

    println("enter the symble")
    var syc =scala.io.StdIn.readLine()
    var n1 = scala.io.StdIn.readInt()

    syc match{
      case "+" => println(n1+n1)
      case "-" => println(n1-n1)
      case "*" => println(n1*n1)
      case "/" => println(n1/n1)
    }
  }

}
