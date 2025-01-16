object loops_assignment {

  def main(args :Array[String]): Unit = {

//    1)Print numbers from 1 to 5 using a for loop.
    println("Print numbers from 1 to 5 using a for loop")
    for (i<- 1 to 5){
      println(i)
    }

//    2)Print even numbers from 2 to 10 using a while loop.
    println("Print even numbers from 2 to 10 using a while loop")
    for ( i<- 2 to 10 ){
      if (i%2==0){
        println(i)
      }
    }
    var a=1
    while(a<=10){
      if(a%2 ==0){
        println(a)
      }
      a=a+1
    }

//    3)Calculate the sum of all numbers from 1 to 50 using a for loop.

    println("Calculate the sum of all numbers from 1 to 50 using a for loop")
    var sum=0
    for(i<- 1 to 50){
      sum=sum+i
    }
    println("sum :" +sum)

//    4)Print the square of numbers from 1 to 5 using a for loop.
    println("Print the square of numbers from 1 to 5 using a for loop")
    for(i<-1 to 5){
      var sqr = i*i
      println(sqr)
   }
//    5)Print the reverse of a given list using a while loop.
    println("Print the reverse of a given list using a while loop.")
     var num =41
     var res=0
    var c=0
    while(num !=0){
      c=num%10
       res = res*10+c
      num=num/10
    }
println(res)

//    6)Generate and print the first 5 multiples of 3 using a for loop.

    println("6)Generate and print the first 5 multiples of 3 using a for loop.")
    num=0
    for(i<- 1 to 5){
      num=i*3
      println(num)

    }
//    7)Print odd numbers from 1 to 15 using a while loop.

    println("7)Print odd numbers from 1 to 15 using a while loop.")
    for(i<- 1 to 15){
      if(i%2==1){
        println(i)
      }
    }
//    8)Calculate the factorial of a given number using a for loop.

    println("8)Calculate the factorial of a given number using a for loop.")
    num=5
    var re=1
    for(i<-1 to num){
      re=re*i
    }
    println(re)

//    9)Print the characters of a string in reverse order using a for loop.
    println("9)Print the characters of a string in reverse order using a for loop.")

    var str ="shiva"
   var len=str.length()
//    println(str.charAt(4))
    var res1=" "
    for(i<- (len-1) to 0 by -1  ){
      res1=res1+str.charAt(i)
//      println(res1)
    }
    println(res1)

//    10)Check if a number is prime using a while loop.
    println("10)Check if a number is prime using a while loop.")
    num=15
    var n=1
    var c1=0
    while(n <=num){
      if(num%n ==0){
        c1 = c1 + 1
      }
      n=n+1
    }
    if( c1 ==2){
      println("GIven number is prime")
    }
    else {
      println("Not a prime ")
    }

println("11)Print the elements of a list in reverse order using a for loop.")
    var arr=Array(10,20,30,40)
    var abs= new Array[Int](arr.length)
    println(arr.length)
    for(i<- arr.length-1 to 0 by -1 ){

       abs(arr.length-1-i)=arr(i)
    }
    for(i<- 0 to abs.length-1){

    println(abs(i))
   }

    println("12)Find the sum of all even numbers from 1 to 20 using a while loop.")
    sum=0
    for(i<- 1 to 20 ){
      if(i%2==0){
        sum=sum+i
      }
    }
    println(sum)

    println("13)Check if a string is a palindrome using a &quot;for&quot; loop.")
    num=121
    var og=121
    re=0
    for(i<- 1 to 3)
      {
        var d =num%10
        re=re*10+d
        num=num/10

      }
      println(re)
        println(og)
      if(og == re){
        println("Palindrom")
      }else {
        println("NOt a palindrom")
      }

    println("14)Print the cube of numbers from 1 to 3 using a while loop.")
    for(i<- 1 to 3){
      println(i*i*i)
    }

    println("15)Count the number of vowels in a given string using a for loop.")

    var str2="shva"

    var str3="aeiou"
    var cou=0;

    for(i<-0 to str2.length()-1){

      for(j<-0 to str3.length()-1){
         if(str2.charAt(i) == str3.charAt(j)){
           cou=cou+1
         }
      }


    }
    println(cou)

    println("16)Print the elements of a list using a while loop.")
    var arr1=Array(10,30,60,79)

    var len2=arr1.length
    var k=len2-1
    var m=0
    while( k >=m)
      {
        println(arr1(m))
        m=m+1
      }

    println("17)Calculate the product of numbers from 1 to 5 using a for loop.")
    var pr=1
    for(i<- 1 to 5){
      pr=pr*i
      println(pr)
    }

    println("18)Check if a given number is a perfect square using a while loop.")
    num=6
    var sq=0
    var count=0
    for(i<-1 to num){
      var sq=i*i
      if (sq == num){
        count=count+1
      }

    }
    if( count==1){
      println("Given number is perfect square")
    }else {
      println("Not a perfect square")
    }

  }

}
