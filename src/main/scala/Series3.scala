object Series3 {
  def main(args:Array[String]):Unit={

//    23. Write programs to print the following series. 5^2, 7^2,9^2.....25^2
    for(i<-5 to 25 if(i%2==1)){
      if(i<25){
        print(i+"^2,"+" ")
      }
      else {
        print(i+"^2"+" ")
      }


    }
  }

}
