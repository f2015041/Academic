#include <stdio.h>
#include <string.h>
main ()
{
  int mat1[10][10], mat2[10][10], mat3[10][10], mat4[10][10], m, n, i, j;
  scanf ("%d", &m);
  scanf ("%d", &n);
  for (i = 0; i < m; i++)
    {
      for (j = 0; j < n; j++)
	{
	  scanf ("%d", &mat1[i][j]);
	}
    }

  for (i = 0; i < m; i++)
    {
      for (j = 0; j < n; j++)
	{
	  scanf ("%d", &mat2[i][j]);
	}
    }

  for (i = 0; i < m; i++)
    {
      for (j = 0; j < n; j++)
	{
	  mat3[i][j] = mat1[i][j] + mat2[i][j];
	}
    }
  for (i = 0; i < m; i++)
    {
      for (j = 0; j < n; j++)
	{
	  mat4[i][j] = mat1[i][j] - mat2[i][j];
	}
    }
  for (i = 0; i < m; i++)
    {
      printf ("\n");
      for (j = 0; j < n; j++)
	{
	  printf ("%d", mat3[i][j]);
	}
    }
  for (i = 0; i < m; i++)
    {
      printf ("\n");
      for (j = 0; j < n; j++)
	{
	  printf ("%d", mat4[i][j]);
	}
    }
}
