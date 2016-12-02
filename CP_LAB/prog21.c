#include <stdio.h>

void
main ()
{
  int n;
  scanf ("%d", &n);
  addme (n);
}

void
addme (int n)
{
  int sum, i, a[100];
  for (i = 0; i < n; i++)
    {
      scanf ("%d", &a[i]);
    }
  for (i = 0; i < n; i++)
    {
      sum += a[i];
    }
  printf ("%d", sum);
}
