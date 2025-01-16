object Series_pattern1 {
  def main(args:Array[String]):Unit={
//    21. Write a program to print the series : 10@9,9@8,8@7.......-5@-6

    for (i<- 10  to -10 by -1  ){
      print(i+"@"+(i-1)+" ")
    }
  }

}
