#include <stdio.h>
//arreglo desordenadp si  numeros repetidos
int A[15]= {5,4,10,8,2,11,9,1},n;
int main() {
	//muestro el arreglo antes de odificarlo:
	printf("Arreglo Ahora:\n");
	for(int i=0; i<15;i++){
		printf("%d    ",A[i]);
	}
	//ingreso y almacenamiento de dato.
	printf("\ningrese un numero: ");
	scanf("%d",&n);
	
	//ingreso al inicio
	for(int i = 14;i >=0; i--){
		A[i]=A[i-1];
	}
	A[0]=n;
	//muestro el arreglo
	printf("Arreglo terminado:\n");
	for(int i=0; i<15;i++){
		printf("%d    ",A[i]);
	}
	return 0;
}

