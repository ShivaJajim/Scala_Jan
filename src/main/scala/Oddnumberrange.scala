object Oddnumberrange {

  def main(args:Array[String]):Unit={
//    11. Write a program to print all odd numbers from 251 to 51. like (251,
//      249,...51)
    for(i<- 251 to 51 by -1){
      if(i%2==1){
        println(i)
      }
    }
  }

}
