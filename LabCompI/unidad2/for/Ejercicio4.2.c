#include <stdio.h>
int n, i, factorial;

int main() {
	printf("Ingrese el numero: ");
	scanf("%d", &n);
	
	for(i = n-1; i >= 1; i--){
		factorial = n * i;
		n = factorial;
	}
	printf("EL factorial del numero ingresado es: %d\n", factorial);
	return 0;
}

