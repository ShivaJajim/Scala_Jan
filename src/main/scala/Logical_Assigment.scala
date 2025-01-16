

object Logical_Assigment {

  def main(args: Array[String]): Unit = {

    //    1)Check for Even AND Positive Number:
    //      Write a Scala function to check if a given number is both even and positive.
    //    Sample Data:
    //      Number: 14
    var a = 14
    println("Give number is " + a)
    if (a % 2 == 0 && a >= 0) {
      println("GIven Number is even & postive " + a)
    }
    else {
      println("Given number is not a even number " + a)
    }

    //    2)Range Check with OR:
    //      Create a Scala program to determine if a given value is either less than -10 or greater than 10.
    //    Sample Data:
    //      Value: -15

    a = -15
    println("Given Number is " + a)
    if (a < -10 || a > 10) {
      println("given value is either less than -10 or greater than 10 i.e " + a)

    }
    else {
      print("given value is nither less than -10 or greater than 10 " + a)
    }

    //    3)Odd Number Check with AND:
    //      Implement a Scala function to check if a given number is odd and not divisible by 3.
    //    Sample Data:
    //      Number: 27
    a = 27
    println("gIven Number is " + a)
    if (a % 2 == 1 && a % 3 == 0) {
      println(" given number is odd and not divisible by 3")
    }
    else {
      println(" given number is not a odd and not divisible by 3")
    }

    //    4)Divisibility by 4 OR 6:
    //      Write a Scala program to check if a given number is divisible by either 4 or 6.
    //    Sample Data:
    //      Number: 18
    a = 18
    println("Given number is " + a)
    if (a % 4 == 0 || a % 6 == 0) {
      println("given number is divisible by either 4 or 6")
    }
    else {
      print("given number is not divisible by either 4 or 6")
    }
    //
    //    5)Eligibility for Voting OR Driving:
    //      Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
    //      eligible to drive (age greater than or equal to 16).
    //      Sample Data:
    //      Age: 20

    a = 20
    println("Given number is " + a)
    if (a >= 16) {
      println("eligible to drive")
      if (a >= 18) {

        println("a person is eligible to vote")
      }
    }
    else {
      println("Not eligible ")
    }

    //    6)Multiple Range Check:
    //      Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
    //    Sample Data:
    //      Number: 25

    a = 25
    println("Given Number is :" + a)
    if ((a >= 1 && a <= 10) || (a >= 20 && a <= 30)) {
      println("given number is in the range [1, 10] or [20, 30]")
    }
    //
    //    7)Check for Negative AND Odd Number:
    //      Implement a Scala program to check if a given number is both negative and odd.
    //    Sample Data:
    //      Number: -7

    a = -7
    println("Given Number is :" + a)
    if (a < 0 && a % 2 == 1) {
      print("given number is both negative and odd")
    }
    else {
      print("given number is not negative and odd")
    }
    //
    //    8)Eligibility for Senior Discount OR Student Discount:
    //      Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
    //    60) or a student discount (age less than 25).
    //    Sample Data:
    //      Age: 63
    a = 63
    println("Given Number is : " + a)
    if (a > 60) {
      println("person is eligible for a senior citizen discount")
    }
    else if (a < 25) {
      println("person is eligible for a student discount ")
    }
    else {
      println("Not eligible for any discount")
    }
    //
    //    9)Divisibility by 5 AND 7:
    //      Write a Scala function to check if a given number is divisible by both 5 and 7.
    //    Sample Data:
    //      Number: 35

    a = 35
    println("Given Number is :" + a)
    if (a % 5 == 0 && a % 7 == 0) {
      println("a given number is divisible by both 5 and 7")
    }
    else {
      println("a given number is not divisible by both 5 and 7")
    }

    //    10)Check for Non-Negative OR Even Number:
    //      Create a Scala program to check if a given number is either non-negative or even.
    //      Sample Data:
    //      Number: -8

    a = -8
    println("Given number is :" + a)
    if (a > 0 || a % 2 == 0) {
      println("given number is either non-negative or even.")
    }
    else {
      println("given number is not non-negative or even.")
    }

    //    11)Check for Prime AND Odd Number:
    //      Write a Scala function to check if a given number is both a prime number and an odd number.
    //    Sample Data:
    //      Number: 17

    a = 17
    println("GIven number is :" + a)
    if (a % 2 == 1) {
      println("given number is odd")
      var count = 0
      for (i <- 1 to a) {
        if (a % i == 0) {
          count = count + 1
        }
      }

      if (count == 2) {
        println("Givn number is prime ")
      }
      else {
        println("Given number is not a prime")
      }
    }
      //      12)Eligibility for Discount OR Free Shipping:
      //        Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
      //        than 150) or qualifies for free shipping (purchase amount greater than 100).
      //        Sample Data:
      //        Purchase Amount: 120
      a = 120
      println("Given number is :" + a)
      if (a > 150 || a > 100) {
        println("a customer is eligible for a discount or qualifies for free shipping ")
      }
      else {
        println("a customer is not eligible for a discount or qualifies for free shipping ")
      }
      //    13)Divisibility by 3 OR 8:
      //      Write a Scala function to check if a given number is divisible by either 3 or 8.
      //    Sample Data:
      //      Number: 24

      a = 24
      println("Given number is :" + a)
      if (a % 3 == 0 || a % 8 == 0) {
        println("given number is divisible by either 3 or 8")
      }
      else {
        println("given number is not divisible by either 3 or 8")
      }
      //    14)Check for Non-Positive AND Even Number:
      //      Implement a Scala program to check if a given number is both non-positive and even.
      //      Sample Data:
      //      Number: -6
      a = -6
      if (a < 0 && a % 2 == 0) {
        println("given number is both non-positive and even")
      }
      else {
        println("given number is positive and even")
      }
      //
      //    15)Age Group Classification with AND:
      //      Create a Scala program to classify a person&#39;s age group. Classify them as a child (less than 13),
      //    teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
      //      Sample Data:
      //      Age: 15

      a = 15
      println("Given number is :" + a)
      if (a < 13) {
        println("child")
      } else if (a >= 13 && a <= 19) {
        println("teenager")
      }
      else if (20 < a || a == 20) {
        println("adult")
      }
      else {
        println("Not applicatble ")
      }
      //    16)Check for Divisibility by 2 OR 5:
      //      Write a Scala function to check if a given number is divisible by either 2 or 5.
      //    Sample Data:
      //      Number: 25
      a = 25
      println("Given number is :" + a)
      if (a % 2 == 0 || a % 5 == 0) {
        print("given number is divisible by either 2 or 5")
      }
      else {
        println("given number is not divisible by either 2 or 5")
      }
      //
      //    17)Eligibility for Senior Discount AND Student Discount:
      //      Create a Scala program to check if a person is eligible for both a senior citizen discount (age greater
      //      than 60) and a student discount (age less than 25).
      //    Sample Data:
      //      Age: 70

      a = 70
      println("Given number is:" + a)
      if (a > 60 && a < 25) {
        println("person is eligible for both a senior citizen discount (age greater     than 60) and a student discount")
      }
      else {
        println("person is not eligible for both a senior citizen discount (age greater    than 60) and a student discount")
      }
      //    19)Check for Multiple of 3 AND 7:
      //      Implement a Scala function to check if a given number is both a multiple of 3 and 7.
      //    Sample Data:
      //      Number: 21

      a = 21
      println("Given number is :" + a)
      if (a % 3 == 0 && a % 7 == 0) {
        println("given number is both a multiple of 3 and 7")
      }
      else {
        println("given number is not  a multiple of 3 and 7")
      }
      //
      //    20)Divisibility by 5 OR 9:
      //      Write a Scala program to check if a given number is divisible by either 5 or 9.
      //
      //    Sample Data:
      //      Number: 45

      a = 45
      println("Given number is :" + a)
      if (a % 5 == 0 || a % 9 == 0) {
        println("given number is divisible by either 5 or 9")
      }
      else {
        println("given number isnot  divisible by either 5 or 9")
      }
      //
      //    21)Check for Odd AND Not Divisible by 4:
      //      Create a Scala program to check if a given number is both odd and not divisible by 4.
      //    Sample Data:
      //      Number: 15

      a = 25
      println("Given number is :" + a)
      if (a % 2 == 1 && a % 4 == 0) {
        println("given number is both odd and not divisible by 4")
      }
      else {
        println("given number is not  odd and not divisible by 4")
      }

      //    22)Check for Divisibility by 3 AND 5:
      //      Write a Scala function to check if a given number is divisible by both 3 and 5.
      //    Sample Data:
      //      Number: 15

      a = 15
      println("GIven number is :" + a)
      if (a % 3 == 0 && a % 5 == 0) {
        println("given number is divisible by both 3 and 5")
      }
      else {
        println("given number is not divisible by both 3 and 5")
      }


      //    23)Eligibility for Discount OR Membership Benefits:
      //      Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
      //      than 200) or qualifies for membership benefits (loyalty card available).
      //    Sample Data:
      //      Purchase Amount: 180
      //    Loyalty Card: true

      a = 180
      var card = true
      println("Given number is :" + 180)
      if (a > 200 || card == true) {
        println("customer is eligible for a discount or qualifies for membership benefits ")
      }
      else {
        println("customer is not  eligible for a discount or qualifies for membership benefits ")
      }
      //    24)Divisibility by 2 OR 3:
      //      Write a Scala function to check if a given number is divisible by either 2 or 3.
      //    Sample Data:
      //      Number: 9

      a = 9
      println("Given number is :" + a)
      if (a % 2 == 0 || a % 3 == 0) {
        println("given number is divisible by either 2 or 3")
      }
      else {
        println("given number is not  divisible by either 2 or 3")
      }

      //    25)Check for Positive AND Not Divisible by 3:
      //      Implement a Scala program to check if a given number is positive and not divisible by 3.
      //    Sample Data:
      //      Number: 7
      a = 7
      println("GIven number is :" + a)
      if (a > 0 && a % 3 == 0) {
        println("given number is positive and not divisible by 3")
      }
      else {
        println("given number isnot  positive and not divisible by 3")
      }
      //    26)Eligibility for Senior Discount AND Not a New Customer:
      //      Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
      //    65) and is not a new customer.
      //    Sample Data:
      //      Age: 70
      //    New Customer: false

      a = 70
      println("givne number is :" + a)
      var custer = false
      if (a > 65 && custer == false) {
        println("person is eligible for a senior citizen discount (age greater than 65) and is not a new customer.")
      }
      //    27)Check for Odd OR Prime Number:
      //      Write a Scala function to check if a given number is either odd or a prime number.
      //    Sample Data:
      //      Number: 11
      a = 11
      println("Given number is :" + a)
      var count1 = 0
      for (i <- 1 to a) {
        if (a % i == 0) {
          count1 = count1 + 1

        }
      }
      if (a % 2 == 1 || count1 == 2) {
        println("given number is either odd or a prime number")
      }
      else {
        println("given number is not  odd or a prime number")
      }
      //    28)Eligibility for Discount AND Free Shipping:
      //      Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
      //      than 150) and qualifies for free shipping (purchase amount greater than 100).
      //      Sample Data:
      //    Purchase Amount: 120
      a = 120
      println("given number is :" + a)
      if (a > 150 && a > 100) {
        println("a customer is eligible for a discount and qualifies for free shipping ")
      }
      else {
        println("a customer is not  eligible for a discount and qualifies for free shipping ")
      }
      //    29)Check for Non-Negative AND Not Divisible by 7:
      //      Implement a Scala program to check if a given number is non-negative and not divisible by 7.
      //    Sample Data:
      //      Number: 14

      a = 13
      println("GIvne number is :" + a)
      if (a > 0 && a % 7 != 0) {
        println("given number is non-negative and not divisible by 7")
      }
      else {
        println("given number is non-negative and  divisible by 7")
      }

      //    30)Eligibility for Student Discount OR Free Trial:
      //      Write a Scala program to check if a person is eligible for a student discount (age less than 25) or is
      //      eligible for a free trial.
      //      Sample Data:
      //      Age: 22
      //    Free Trial: true

      a = 22
      var Trial = true
      println("Given number is :" + a)
      if (a < 20 || Trial == true) {
        println("eligible for a student discount or free trial ")
      }
      else {
        println("not eligible for a student discount or free trial ")
      }

      //    31)Check for Divisibility by 4 OR 6:
      //      Create a Scala function to check if a given number is divisible by either 4 or 6.
      //    Number: 24
      a = 24
      println("Given number is :" + a)
      if (a % 4 == 0 || a % 6 == 0) {
        println("given number is divisible by either 4 or 6")
      }
      else {
        println("given number is not  divisible by either 4 or 6")
      }


    }


}

