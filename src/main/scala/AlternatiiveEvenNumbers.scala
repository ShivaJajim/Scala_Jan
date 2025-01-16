object AlternatiiveEvenNumbers {

  def main(args:Array[String]):Unit={

//    13. Write a program to print alternate even numbers from 20 to 140. Like
//      (20,24,28...)
    var count=0
    for(i<- 20 to 140 ){
      if(i%2==0){
        if( count%2==0){
          println(i)
        }
        count=count+1
      }

    }

  }

}
