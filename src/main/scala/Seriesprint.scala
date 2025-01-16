object Seriesprint {

  def main(args:Array[String]):Unit={
//    15. Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – patter
//    & multiplied value)

    for(i <- 1 to 17){
      print(i+"*"+(i+1)+" ")


    }
    println("  ")
    for(i <- 1 to 17){

      print(i*(i+1)+" ")
    }

  }

}
