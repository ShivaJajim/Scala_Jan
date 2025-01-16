object Biggest_Nmuber {

  def main(args:Array[String]):Unit={
    println("Enter the 1st number ")
    var n1=scala.io.StdIn.readInt()
    println("Enter the 2st number ")
    var n2=scala.io.StdIn.readInt()
    println("Enter the 3st number ")
    var n3=scala.io.StdIn.readInt()

    if ( n1 >n2 && n1>n3){
      println("Biggest number is :"+ n1)
    }
    else if ( n2 >n1 && n2>n3){
      println("Biggest number is :"+ n2)
    }
    else {
      println("Biggest number is :"+ n3)
    }


  }

}
