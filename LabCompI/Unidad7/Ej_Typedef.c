#include <stdio.h>
#include <string.h>

int n;
typedef int numTelefono[10];
typedef char nombre[20];

int main() {
	numTelefono usuario1;
	nombre nomUsuario1;
	
	//ingreso de valores para el telefono del usuario 1
	printf("Ingrese el numero de teléfono:\n");
	for(int i=0; i < 10; i++){
		printf("Lugar %d:",i+1);
		scanf("%d",&n);
		usuario1[i]=n;
	}
	//pide el nombre al usuario1
	printf("Ingrese su nombre: ");
	scanf("%s",nomUsuario1);
	
	//muestro
	printf("Su numero de telefono es: ");
	for(int i=0; i < 10; i++){
		printf("%d",usuario1[i]);
	}
	printf("\nSu nombre es: %s",nomUsuario1);
	return 0;
}

