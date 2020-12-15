#include <stdio.h>
int n,llamFACT,factorial=1;

int fact(int n){
	for(int i=2; i<=n; i++){
		factorial = factorial * i;
	}
	return factorial;
}
	
int main() {
	printf("Ingrese el numero para calcular su factorial: ");
	scanf("%d",&n);
	
	llamFACT=fact(n);
	
	printf("el factorial de %d es: %d\n",n,llamFACT);
	return 0;
}

