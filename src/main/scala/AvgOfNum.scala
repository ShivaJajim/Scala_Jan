object AvgOfNum {

  def main(args:Array[String]):Unit={

    //18. Write a program to find the average of 24,26,28,.....100.
    var sum=0
    var count=0
    println("enter the numbers")
    var n1 = scala.io.StdIn.readInt()
    var n2 =scala.io.StdIn.readInt()

    for(i<-n1 to n2 if(i%2==0)){

      sum=sum+i
      count=count+1
    }
    println(sum)
    println(count)
    var avg = sum/count

    println("avg is:" + avg)
  }

}
