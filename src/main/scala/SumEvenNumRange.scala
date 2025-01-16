object SumEvenNumRange {

  def main(args:Array[String]):Unit={
//    16. Write a program to sum all even numbers between 382 and 582.
    var sum=0
    for(i<- 382 to 582){
      if(i%2 ==0){
        sum=sum+i
      }
    }
  println(sum)
  }

}
