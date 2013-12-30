#include <stdio.h>
#include <stdlib.h>

int main(){
	int  * p = (int *)malloc(sizeof(int) * 4);
	*p = 1;
	*(p + 1) = 2;
	*(p + 2) = 3;	
	*(p + 3) = 4;
	*(p + 4) = 5; // error,memory overflow

	int i;
	for (i=0;i < 5;i++){ // error, should be i < 4
		printf("no.%d is %d\n",i,*p);
		p++;	
	}
	return 0;
}
