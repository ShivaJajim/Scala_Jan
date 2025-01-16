object Pattern4 {


//  4)HOLLOW PATTERN
//
//  * * * * * *
//  * *
//  * *
//  * * * * * *

  def main(args:Array[String]):Unit={

     for(i<-1 to 4){

       for(j<-1 to 4){
         if(i==1 || j==1 || i==4 || j==2){
           print("*")
         }else{
           print("  ")
         }

       }
       println(" ")

     }

  }

}
