#include <stdio.h>

void
main ()
{
  int a[100], i, n, small, flag = 1;
  scanf ("%d",&n);
  for (i = 0; i < n; i++)
    {
      scanf ("%d",&a[i]);
    }
  small = func (a[100], n);
  printf ("%d", small);
}

int
func (int a[100], int n)
{
  int small, i;
  small =a[0];
  for (i = 0; i < n; i++)
    {
      if (a[i] < small)
	small = a[i];
    }
  return small;
}
