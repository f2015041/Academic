import java.util.*;
class Sum implements Runnable{
      int intsum=0;
      int num1,num2;
      public Sum(int num1,int num2){
             this.num1=num1;
	     this.num2=num2;
      }
     public void run(){
         for(int i=num1;i<=num2;i++){
	    intsum=intsum+i;
         }
         System.out.println("Sum from "+num1+" to "+num2+ " is " + intsum);
       }
 }
 
 public class p21sumthread{
        public static void main(String args[]){;
	Scanner n=new Scanner(System.in);
	int num=n.nextInt();  // input for num
	int b=n.nextInt();
	int i=0;
	int flag=1;
	int t=num/b;
	int incr=t;
	try{
	while(t<=num){
	   Sum sum=new Sum(i,t);
	   Thread t1=new Thread(sum);
	   t1.start();
	   i=i+incr;
	   t=t+incr;
	   System.out.println("Thread "+flag);
	   flag=flag+1;
	   t1.join();
	}
	}catch(InterruptedException e){}
     }
}


