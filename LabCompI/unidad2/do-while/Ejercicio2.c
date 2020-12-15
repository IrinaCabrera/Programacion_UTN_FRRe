#include <stdio.h>

int main() {
	int i = 0, x = 0;
	printf("i toma valores de cero a diecinueve, x equivale a cuantos valores que toma i en ese rango al dividirlos por 5 da resto cero.");
	printf("\nEsos valores serian: 1, 5, 10 y 15. por eso x vale 4.");
	do{
		if (i % 5 == 0){
			x++;
			printf("\n%d", x);
		}
		i++;
	}while(i < 20);
	printf("\nx= %d", x);
	return 0;
}

