#include <stdio.h>
#include <string.h>

struct std
{
  char name[20], idno[25], station[25];
  float cgpa;
};

void
main ()
{
  int n, i;
  char ele[100];
  scanf ("%d", &n);
  struct std s[n];
  for (i = 0; i < n; i++)
    {
      scanf ("%f", &s[i].cgpa);
      gets (s[i].name);
      gets (s[i].idno);
      gets (s[i].station);
    }
  gets (ele);
  for (i = 0; i < n; i++)
    {
      if (!(strcmp (s[i].name, ele)))
	{
	  puts (s[i].name);
	  puts (s[i].idno);
	  puts (s[i].station);
	  printf ("%d", s[i].cgpa);
	}


    }
}
