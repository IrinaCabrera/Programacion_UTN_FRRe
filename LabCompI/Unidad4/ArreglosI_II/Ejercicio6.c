#include <stdio.h>

int main() {
	int arr1[10]={10,9,8,7,6,5,4,3,2,1};
	int arr2[10]={20,19,18,17,16,15,14,13,12,11};
	int arrcombinado[20], j=0, soporte;
	
	//cargo arr1 y arr2 en arrcombinado
	for(int i=0; i<10; i++){
		arrcombinado[j]=arr1[i];
		j++;
	}
	for(int i=0; i<10; i++){
		arrcombinado[j]=arr2[i];
		j++;
	}
	
	//muestro el arreglo arrcombinado sin ordenar.
	printf("arreglo arrcombinado sin ordenar: \n");
	for(int i=0; i<20; i++){
		printf("%d   ",arrcombinado[i]);
	}
	
	//ordeno el arreglo de menor a mayor
	printf("\narreglo arrcombinado ordenado de menor a mayor: \n");
	for(int i=0; i<20-1; i++){//cuantas vueltas debe dar
		for(int j=0; j<20-1; j++){//ordena en si los arreglos
			if(arrcombinado[j] < arrcombinado[j+1]){
				soporte = arrcombinado[j];
				arrcombinado[j]=arrcombinado[j+1];
				arrcombinado[j+1]= soporte;
			}
		}
	}
	
	//muestro el arreglo orenado
	for(int i=0; i<20; i++){
		printf("%d   ",arrcombinado[i]);
	}
	
	
	return 0;
}

