object Range {
  def main(args:Array[String]):Unit={
//    4. Write a java program that performs the following tasks.
//    a. Store a number in a variable
//      b. If value is not in range (100-1000) prints wrong number else follows
//    the steps
//      c. Check even or odd
//      d. If even divide the number by 3 and print the remainder
//    e. If odd divide the number by 2 and print the remainder.
    print("enter the number: ")
    var num = scala.io.StdIn.readInt()
    var count =0
    for(i<- 100 to 1000){
      if(num==i){
        count=count+1
      }
    }
    if(count==1){

      if( num %2==0){
        println("given number is Even ")
        var res1=num%3
        println(res1)
      }
      else{
        println("Given number is Odd")
        var res2=num%2
        println(res2)
      }

    }
    else {
      println("Wrong Number")
    }

  }

}
