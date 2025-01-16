object pattern5 {

  def main(args:Array[String]):Unit={

//    5)
//
//    *
//    *-*
//    *-*-*
//    *-*-*-*
//    *-*-*-*-*

    for(i<-1 to 5){
      for(j<-1 to i){
        if (j%2==0){
          print("-")
        }
        else {
          print("*")
        }
      }
      //print("*")
      println()
    }


  }

}
