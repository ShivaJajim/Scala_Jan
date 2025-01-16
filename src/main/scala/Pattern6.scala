object Pattern6 {

  def main(args:Array[String]):Unit={


//    6)
//
//    *
//    ***
//    *****
//    *******
//    *********
//    *******
//    *****
//    ***
//    *

    for(i<- 1 to 9){

       for(j<-1 to i){
         if(i%2 ==1){
           print("*")
         }

       }
//      for(k<- to i by -1){
//        if(i%2==1){
//          print("*")
//        }
//      }

      println()
    }
  }

}
