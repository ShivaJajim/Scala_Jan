object Series28 {

  def main(args:Array[String]):Unit={
//    27. Write programs to print the following series. 1,2,factor of three,4,5,factor
//    of three, 7,8,factor of three,..........22,23,factor of three.

    var start=1
    var end = 27

    for(i<- start to end ){

      if(i%3 == 0){
        print("factor of three")
      }
      else {
        print(i)
      }
      if( i != end){
        print(",")
      }

    }

  }
}
