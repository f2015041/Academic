#include <stdio.h>
#include<string.h>

int
main ()
{
  char a[100], b[100], c[100];
  gets (a);
  gets (b);
  gets (c);
  strcat (a, b);
  strcat (a, c);
  puts (a);
}
