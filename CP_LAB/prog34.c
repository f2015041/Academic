#include<stdio.h>
void
main (void)
{
  FILE *fptr;
  char name[20];
  int age;
  float salary;
  fptr = fopen ("emp.txt", "w");
  printf ("Enter the name  \n");
  scanf ("%s", &name);
  fprintf (fptr, "Name =%s\n", name);
  printf ("Enter the age\n");
  scanf ("%d", &age);
  fprintf (fptr, "Age =%d\n", age);
  printf ("Enter the salary");
  scanf ("%f", &salary);
  fprintf (fptr, "Salary =%2f\n", salary);
  fclose (fptr);
}
