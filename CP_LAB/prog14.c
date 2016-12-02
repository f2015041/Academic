#include<stdio.h>
 void main() 
  {
   int n,sum,d,rev;
   scanf("%d" ,&n);
   while(n!=0)
   {
    d=n%10;
    rev=rev*10+d;
    n=n/10;
    sum=sum+d;
   }

    printf("  %d  " , rev);
    printf("  %d  " , sum);
   }
    
   
