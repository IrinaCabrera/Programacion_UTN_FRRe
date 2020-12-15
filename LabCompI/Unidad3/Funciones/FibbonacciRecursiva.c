#include <stdio.h>
int n, llamFib;
int fibonacci(int n){
	if (n>1){
		return fibonacci (n-1) + fibonacci (n-2);
	}else if (n==1){
		return 1;
	}else if(n==0){
		return 0;
	}
}
int main() {
	for(n=0; n<10; n++){
		llamFib=fibonacci(n);
		printf("%d\n", llamFib);
	}
	
	return 0;
}

