object series_pattern27 {

def main(args:Array[String]):Unit= {
  //  26. Write programs to print the following series.
  //  1,even,3,even,5,even,.......35,even
  var start = 1
  var end = 35

  for (i <- start to end if (i % 2 == 1)) {

    print(i)
    if (end != i) {

      print(",even,")
    }
    else {
      print(",even")
    }

  }
}
}
