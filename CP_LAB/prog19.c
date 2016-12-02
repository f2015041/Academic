#include <stdio.h>

void
main ()
{
  int a[100], b[100], n, i, j, flag = 1;
  printf ("Input n \n");
  scanf ("%d", &n);
  printf ("Input arr1 \n");
  for (i = 0; i < n; i++)
    {
      scanf ("%d", &a[i]);
    }
  printf ("Input arr2 \n");
  for (i = 0; i < n; i++)
    {
      scanf ("%d", &b[i]);
    }

  printf (" Loop checking \n ");
  for (i = 0; i < n; i++)
    {
      if (a[i] != b[i])
	flag = 0;
    }

  if (flag)
    printf (" Same ");
}
