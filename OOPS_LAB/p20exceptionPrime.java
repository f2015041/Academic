import java .util.*;
class myPrimeException extends Exception{
     public myPrimeException(){
            System.out.println("Illegal argument exception");
    }
}

class Prime {
      int n;
      public Prime(int p) throws myPrimeException{
      
       if(p<0){ throw new myPrimeException(); }
       else{ n=p; System.out.println("no is "+n); }
      }
}

public class p20exceptionPrime{
       public static void main(String args[]){
       //Scanner n=new Scanner(System.in);
       try{
          Prime p=new Prime(20);
       }
       catch(myPrimeException e){
           // e.printStackTrace();
       }
   }
}
