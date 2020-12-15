#include <stdio.h>
int A[15] = {5, 4,10,8,2,11,9,1,5,11,1},n,i;
char bandera='f';
int main() {
	
	printf("Ingrese un numero: ");
	scanf("%d",&n);
	
	//recorro el arreglo:
	for(i=0; i<15;i++){
		//n es igual al elemento de a en la posicion i?
		if(n==A[i]){
			//muestra en que posicion está de ser encontrado
			printf("Elemento encontrado en la posición: %d\n",i);
			//me sirve para saber saber si se encontró ese elemento en alguna posicion.
			bandera = 'v';
		}
	}
	//si el estado de bandera no cambió a v, entonces no existe ese elemento.
	if(bandera=='f'){
		//notifica al usuario en cao de no haberlo encontrado
		printf("Elemento no encontrado");
	}
	return 0;
}

