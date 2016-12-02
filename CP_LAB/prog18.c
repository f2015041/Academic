#include <stdio.h>

int
main ()
{
  int sum, a[5], i, avg;
  for (i = 0; i < 5; i++)
    {
      scanf ("%d", &a[i]);
    }
  for (i = 0; i < 5; i++)
    {
      sum += a[i];
    }
  avg = sum / 5;

  if (avg >= 0)
    {
      if (avg >= 80)
	{
	  printf ("Distiction");
	}
      if (avg >= 69 && avg <= 80)
	{
	  printf ("Class1");
	}
      if (avg >= 59 && avg <= 69)
	{
	  printf ("Class2");
	}
      if (avg >= 49 && avg <= 59)
	{
	  printf ("Class3");
	}
      if (avg >= 38 && avg <= 49)
	{
	  printf ("Average");
	}

      if (avg >= 0 && avg <= 38)
	{
	  printf ("Fail");
	}
    }
  return 0;
}
