object Series4 {

  def main(args:Array[String]):Unit={
//    25. Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
    var end_var= -12
    for(i<- 4 to -12 by -1) {
      print("5*"+i)
      if (i != end_var) {
        print(",")
      }
    }
      for(i<- 4 to -12 by -1) {
        print(5 * i)
        if (i != end_var) {
          print(",")
        }

      }
  }

}
