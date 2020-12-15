#include <stdio.h>

int n,i,soporte;
//ARREGLO ORDENADO SIN ELEMENTOS REPETIDOS
int A[15]= {1,4,6,8,10,11,15,16};
//ARREGLO ORDENADO CON ELEMENTOS REPETIDOS
int B[15]= {1,4,6,6,8,10,11,11,15,16,16};
//ARREGLO DESORDENADO SINELEMENTOS REPETIDOS
int C[15]= {5,4,10,8,2,11,9,1};
//ARREGLO DESORDENADO CONELEMENTOS REPETIDOS
int D[15]= {5,4,10,8,2,11,9,1,5,11,1};

int main() {
	printf("Ingrese un numero a incertar: ");
	scanf("%d",&n);
	
	//hago un lugar para insertar al inicio para todos los arreglos
	for(i=15;i>=0;i--){
		//para arreglo A
		A[i]=A[i-1];
		//para arreglo B
		B[i]=B[i-1];
		//para arreglo C
		C[i]=C[i-1];
		//para arreglo D
		D[i]=D[i-1];
	}
	//incertamos al inicio el numero n en cada arreglo:
	//para A
	A[0]=n;
	//para B
	B[0]=n;
	//para C
	C[0]=n;
	//para D
	D[0]=n;
	
	//mosramos el arreglo
	printf("\nArreglo A:\n");
	for(i=0;i<15;i++){
		//para arreglo A
		printf("%d    ",A[i]);
	}
	printf("\nArreglo B:\n");
	for(i=0;i<15;i++){		
		//para arreglo B
		printf("%d    ",B[i]);
	}
	printf("\nArreglo C:\n");
	for(i=0;i<15;i++){
		//para arreglo C
		printf("%d    ",C[i]);
	}
	printf("\nArreglo C:\n");
	for(i=0;i<15;i++){
		//para arreglo D
		printf("%d    ",D[i]);
	}
	return 0;
}

