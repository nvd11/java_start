#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct A{
		int id;
		char name[16];
		void (* A_prinf)(struct A *);
};

void printf_A(struct A * b){
		printf("%d, %s\n", b->id, b->name);
}

struct A * A_new(int id, char * name){
	struct A * b = (struct A *)malloc(sizeof(struct A));
	b->A_prinf = printf_A;
	b->id = id;
	strcpy(b->name,name);
	return b;
}

int main(){
	struct A  * a;
	a = A_new(1,"Jack");
	a->A_prinf(a);

	free(a);
	a = NULL;
	return 0;	
}