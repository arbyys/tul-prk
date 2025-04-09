#include <stdio.h>
int fun(int n1, int n2) {
    int temp = n2 % n1;
    return (n2*n1)+temp;
}

int main() {
   fun(5, 4);
   return 0;
}
