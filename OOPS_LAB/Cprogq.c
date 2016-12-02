#include<stdio.h>
void main(){
    int start,end,step;
    printf("Enter start,end and step");
    scanf("%d%d%d",&start,&end,&step);
    int i,sum=0;
    for(i=start;i<=end;i=i+step){
       sum=sum+i;
    }
    printf("The sum is %d",sum);
}
