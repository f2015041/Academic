#include<stdio.h>
#include<stdlib.h>

int main ()
{
  int num1, num2, choice;

  printf ("[0] Exit\v[1] Add\v[2] Subtract\v[3] Multiply\v[4] Divide");
  scanf ("%d", &choice);

  switch (choice)
    {
    case 0:
      return 0;
      break;
    case 1:
      printf ("Enter 1st number:\n");
      scanf ("%d", &num1);
      printf ("Enter 2nd number:\n");
      scanf ("%d", &num2);
      printf ("%d", num1 + num2);
      break;
    case 2:
      printf ("Enter 1st number:\n");
      scanf ("%d", &num1);
      printf ("Enter 2nd number:\n");
      scanf ("%d", &num2);
      printf ("%d " ,num1-num2);
      break;
    case 3:
      printf ("Enter 1st number:\n");
      scanf ("%d", &num1);
      printf ("Enter 2nd number:\n");
      scanf ("%d", &num2);
      printf ("%d",num1*num2);
      break;
    case 4:
      printf ("Enter 1st number:\n");
      scanf ("%d", &num1);
      printf ("Enter 2nd number:\n");
      scanf ("%d", &num2);
      printf ("%d",num1/num2);
      break;
    default:
      printf ("That is not a valid choice.");
      break;
    }
   }
