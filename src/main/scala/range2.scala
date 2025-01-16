object range2 {

  def main(args:Array[String]):Unit={
    println("Enter the number :")
    var num = scala.io.StdIn.readInt()
    var count=0
    for(i<-0 to 100){
      if(num == i){
        count=count+1
      }
    }
    if(count==1){
      if(num >=90 && num<=100){
        println("Super Smart")
      }
      else if(num >=80 && num<90){
        println("Smart")
      }
      else if(num >=70 && num<80){
        println("smart enough")
      }
      else if(num >=60 && num<70){
        println("just smart")
      }
      else if(num >=35 && num<60){
        println("no smart")
      }
      else {
        println("dump")
      }

    }
    else {
      println(" invalid input.")
    }
  }

}
