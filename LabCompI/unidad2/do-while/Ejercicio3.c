#include <stdio.h>
#include <math.h>

int main() {
	int n=0, suma=0, cantidad=0;
	char respuesta = 's';
	do{
		printf("introduzca un numero entero: ");
		scanf("%d",&n);
		suma=suma+n;
		printf("\nDesea introducir otro numero (s/n)?: ");
		scanf("%s",&respuesta);
		cantidad++;
		
	}while(respuesta == 's');
	
	printf("\nHa introducido %d numero(s)",cantidad);
	printf("\nLa suma de todos ellos es: %d",suma);
	return 0;
}

