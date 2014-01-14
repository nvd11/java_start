#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct A{
		int id;
		char name[16];
};

int main(){
	struct A a;
	a.id = 1;
	strcpy(a.name, "Jack");
	printf("%d, %s, %d\n", a.id, a.name, sizeof(a));
	return 0;	
}