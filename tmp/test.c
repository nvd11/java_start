#include <stdio.h>
#include <stdlib.h>

int main(){
	int  * p = (int *)malloc(sizeof(int));
	int * q = p;
	*p = 10;
	printf ("*p is %d\n", *p);
	*q = 20;
	printf ("*q is %d\n", *q);

	free(p);
	free(q); //error, the dynamic memory is released already.
	return 0;
}
