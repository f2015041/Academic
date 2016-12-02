#include<stdio.h>
main ()
{
  FILE *fptr;
  fptr = fopen ("emp.txt", "r");
  char buff[30];
  fgets (buff, 30, fptr);
  printf ("%s", buffer);
  fclose (fptr);
}
