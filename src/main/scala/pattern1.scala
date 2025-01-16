object pattern1 {

  def main(args:Array[String]):Unit={
//    1)Program to print a right-angled triangle pattern
//
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

    for( i<- 1 to 5){

      for(j<- 1 to i){
        print("*")
      }
      println(" ")
    }

  }

}
