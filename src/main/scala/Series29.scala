object Series29 {
  def main(args:Array[String]):Unit={

//    29. Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
    var start =0.5
    var end =5.1

   for ( i<- BigDecimal(start) to BigDecimal(end) by BigDecimal(0.2) ) {

     print(i + "^2")
     if (i != end) {
       print(",")
     }
   }
println(" ")
     for ( i<- BigDecimal(start) to BigDecimal(end) by BigDecimal(0.2) ){

       print(i*i)
       if(i != end){
         print(",")
       }


    }
  }

}
