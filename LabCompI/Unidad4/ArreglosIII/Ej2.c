#include <stdio.h>
//arreglo ordenado con elementos repetidos
int A[15] = {1,4,6,6,8,10,11,11,15,16,16},n,lugar;
char bandera = 'f';

int main() {
	//muestro el arreglo antes de codificarlo:
	printf("Arreglo Ahora:\n");
	for(int i=0; i<15;i++){
		printf("%d    ",A[i]);
	}
	
	//ingreso y almacenamiento de dato
	printf("\ningrese el numero: ");
	scanf("%d",&n);
	
	//recorre el arreglo
	for(int i =0; i <15; i++){
		//n es menor o igual al elemento?
		if(n <= A[i]){
			lugar = i;
			bandera='v';
			break;
		}
		//n es mayor o igual al elemento?
		if(n  >= A[10]){
			A[11]=n;
			bandera = 'f';
			break;
		}
	}
	//mueve lugares cuando bandera es v.
	if(bandera == 'v'){
		for(int i = 14;i > lugar; i-- ){
			A[i]=A[i-1];
		}
		A[lugar]=n;
	}
	//muestro el arreglo
	printf("Arreglo terminado:\n");
	for(int i=0; i<15;i++){
		printf("%d    ",A[i]);
	}
	return 0;
}

