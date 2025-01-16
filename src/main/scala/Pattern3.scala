object Pattern3 {

  def main(args:Array[String]):Unit={

//    3)Inverted Triangle Pattern:
//
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

    for(i<- 5 to 1 by -1){

      for(j<-1 to i){
        print("*")
      }
      println(" ")
    }

  }

}
