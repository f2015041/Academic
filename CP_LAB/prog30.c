#include <stdio.h>
#include <string.h>
main ()
{
  char a[40];
  char b[20];
  int i = 0, x = 0, y = 0, t = 0, w = 0, j;
  gets(a);
  gets(b);
  while (a[i] != '\0')
    {
      i++;
      printf("%d\n",i);
    }
getchar();

  for(i=0;b[i] !='\0';i++)
  {
      t++;
     //  printf("Inside Loop %d",t);
    }

  char c[i+t];
  
  for (x = 0; x < i; x++)
    {
      c[x] = a[x];
     
    }

   //  printf("\n %d",g);
    
  for (y = x; y < i + t; y++)
    {

      c[y] = b[w];
      w++;
    }

  printf ("%s", c);
}
