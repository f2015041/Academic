#include <stdio.h>

void
main ()
{
  char a;
  scanf ("%c", &a);
  color (a);
}

void
color (char c)
{
  switch (c)
    {
    case 'R':
      printf ("Red");
      break;

    case 'O':
      printf ("Orange");
      break;

    case 'Y':
      printf ("Yellow");
      break;

    case 'G':
      printf ("Green");
      break;

    case 'B':
      printf ("Blue");
      break;

    case 'I':
      printf ("Indigo");
      break;

    case 'V':
      printf ("Violet");
      break;
    }
}
