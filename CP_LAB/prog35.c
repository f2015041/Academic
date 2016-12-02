#include<stdio.h>
void
main ()
{
  FILE *fptr;
  char name[20];
  int marks;
  fptr = fopen ("student.txt", "w");
  int n, i;
  printf ("Enter the number of students");
  scanf ("%d", &n);
  for (i = 0; i < n; i++)
    {
      printf ("Enter the name  \n");
      scanf ("%s", &name);
      fprintf (fptr, "Name : %s\t", name);
      printf ("Enter the marks\n");
      scanf ("%d", &marks);
      fprintf (fptr, "Marks : %d\n", marks);
    }
  fclose (fptr);
}
