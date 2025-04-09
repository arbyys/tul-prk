/* A simple C++ code to demontrate the optimization switches for gcc */
/* The output should be copied using the attached Makefile. */
/* Maintainer: Lenka Koskova Triskova, lenka.koskova.triskova@tul.cz */
/* License: MIT */

#include <stdio.h>

int condition1(int i){
/* Condition 2:*/
  if (i > 0) {
      printf ("The value of i is %d - condition was true and you see this.\n",i);
      return 1;
    }
  else    {
    printf ("The value of i is %d - condition was false and you see this.\n",i);
    return 1;
     }
  if(i == 0) {
    printf("unreachable branch");
    return 0;
  }

}

int
main (void)
{
 /* "Hidden" true-false conditions */

 
 /* Condition 1:*/ 
 if (1 > 0) {
      printf ("The Condition 1 is always true so the if is removed at opt level 1 and only this message should be present in the output code.\n");
    }
  else    {
    printf ("This message should always disappear from optimized code.\n");
     }

 if (1 < 0) {
     printf("This should never appear in the optimized code!");
 }


condition1(1); /* Internal condition true */
condition1(-10); /* Internal condition false */

 /* For inlining: */
  for (int i=0;i<10;i++){
    if(i > 10) {
      printf("unreachable branch");
    } else if (i < 0) {
      printf("unreachable branch");
    }
      printf("This is for, %dth iteration.",i);
  }
 
  return 0;

}

