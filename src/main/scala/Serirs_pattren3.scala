object Serirs_pattren3 {

  def main(args:Array[String]):Unit={
//    24. Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times
   var n1 = 7
    for(i<- 1 to 7){

        if (i % 2 == 1) {
          print("5")
        }
        else {
          print("10")
        }
      if(n1 !=i)
        print(",")
    }




  }

}
