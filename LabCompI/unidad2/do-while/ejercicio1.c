#include <stdio.h>

int main() {
	int i =1;
	printf("Este programa muestra el valor de i mientras i sea menor o igual a tres.");
	printf("\nEsto quiere decir que i tendra solo 3 valores, uno por cada bucle recorrido.");
	do{
		
		printf("i = %i \n", i);
		i++;
	}while (i <= 3);
	return 0;
}

