#include <stdio.h>
#include <string.h>
main ()
{
  int i = 0;
  char str1[100];
  scanf("%s",str1);
  while (str1[i] != '\0')
    {
      i++;
    }
  printf ("%d", i);
}
