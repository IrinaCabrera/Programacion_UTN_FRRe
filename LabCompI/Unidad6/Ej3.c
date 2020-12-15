#include <stdio.h>
#include <string.h>

char cad[20];
int i,v;
int main() {
	printf("Ingrese su nombre y segundo nombre separados por un punto: ");
	scanf("%s",cad);
	printf("cadena ingresada: %s\n",cad);
	//cuento lugares
	v=strlen(cad);
	//agregar a en lugares vacios.
	for(i=(v);i<=20;i++){
		cad[i]='a';
		//printf("i: %d, contenido de cad en i %c",i,cad[i]);
	}
	printf("cadena ahora: %s\n",cad);
	return 0;
}

