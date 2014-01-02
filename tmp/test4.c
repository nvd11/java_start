#include <stdio.h>
#include <stdlib.h>

int f(){
	int i = 1; // local variable
	static int j = 1; // static local variable
	i++; 
	j++;
	printf("i is %d, j is %d\n",i,j);
	return 0;
}

int main(){
	int i;
	for (i=0;i < 10 ;i++){
		f();
	}
	return 0;
}
