#include <stdio.h>

void
main ()
{
  int a, b;
  a = input (a);
  b = input (b);
  output (a, b);
}

int
input (int a)
{
  scanf ("%d",&a);
  return a;
}

int
output (int a, int b)
{
  printf ("%d %d", a, b);
}
