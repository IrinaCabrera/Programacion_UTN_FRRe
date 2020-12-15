#include <stdio.h>
#include <math.h>
int main() {
	int p;
	float n, suma=0, promedio=0;
	
	for(p = 1; p<=10; p++ ){
		printf("Ingresa un numero: ");
		scanf("%f", &n);
		
		suma= suma +n;
	}
	
	promedio = suma /p;
	printf("\nEl promedio es: %.2f", round(promedio));
	return 0;
}

