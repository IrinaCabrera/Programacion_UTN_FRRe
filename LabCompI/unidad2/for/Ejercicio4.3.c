#include <stdio.h>
int a=0, b=1, c=0;
int main() {
	printf("%d\n%d\n", a, b);
	for(int i = 1; i <14; i++){
		c = a+b;
		a =b;
		b=c;
		printf("%d\n", c);
	}
	
	return 0;
}

