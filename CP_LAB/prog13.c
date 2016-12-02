#include<stdio.h>
void main()
 {
  int i,j,sum,n,x;
  scanf("%d",&n);
  i=0;
  j=1;
  sum=0;
  
  printf( " 0 1" );
  while(sum<=n)
  {
   sum=i+j;
   i=j;
   j=sum;
   sum=i+j;
   if(sum<50)
   printf(" %d " ,sum);
  }
 }
   
   
