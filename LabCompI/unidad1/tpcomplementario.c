#include <stdio.h>
char nombre;

int main() {
	char nombre[1];
	printf("ingrese su nombre: ");
	scanf("%s",&nombre);
	printf("\n su nombre es: %2s", nombre);
	return 0;
}

