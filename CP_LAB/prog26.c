#include <stdio.h>
#include <math.h>
void
main ()
{
  int a, b;
  scanf ("%d %d", &a, &b);
  int x = pow (a, b + 1);
  int y = pow (a, b + 2);
  int z = pow (a, b + 3);
  int w = x + y + z;
  printf ("%d", w);
}
