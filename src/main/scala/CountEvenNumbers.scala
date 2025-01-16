object CountEvenNumbers {

  def main(args:Array[String]):Unit={
    var count=0
    var n1 = scala.io.StdIn.readInt()
    var n2 =scala.io.StdIn.readInt()

    for(i<-n1 to n2 ){
      if(i%2==0){
        count=count+1
      }
    }
    println(count)
  }

}
