object Alphabatesprints {
  def main(args:Array[String]):Unit={

    for(i<- 'A' to 'Z'){
      print(i +" ")
    }

    var ch = 'A'
println(" ")
    for(i<- ch to 'Z'){
      print(ch+" ")
    ch=(ch+1).toChar
    }

println( "  ")
  for(i<- 'a' to 'z'){
    print(i +" ")
  }

   ch = 'a'
  println(" ")
  for(i<- ch to 'z'){
    print(ch+" ")
    ch=(ch+1).toChar
  }
}

}
