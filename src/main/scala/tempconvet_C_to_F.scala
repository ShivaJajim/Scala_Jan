object tempconvet_C_to_F {
def main (args:Array[String]):Unit={
//  2. Write a program to covert temperature from degree C to F. (Input 80C)
//  (80°C × 9/5) + 32 = 176°F

  println("entet the C")
  var c = scala.io.StdIn.readInt()
  var f =(c*9/5)+32
  println("Temp in F "  +f)
}
}
