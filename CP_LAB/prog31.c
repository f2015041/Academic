#include <stdio.h>
#include <string.h>
void
main ()
{
  char a[100];
  gets (a);
  printf ("%d", isPal (a));
}

int
isPal (char str[])
{
 int flag = 1;
 int i,j;
  int n = strlen (str);
  for (i = 0; i < n; i++)
    {
      for (j = n; j < n; j--)
	{
	  if (str[i] == str[j])
	    flag = 0;
	  else
	    flag = 1;
	}
    }
  return flag;
}
