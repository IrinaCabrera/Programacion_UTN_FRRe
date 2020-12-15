#include <stdio.h>
#define f 4
int esPar(int l){
	if(l%2==0){
		return 1;
	}else{
		return 3;
	}
}
int main() {
	int M[f][f]={{1,2,3,4},{3,3,3,3},{9,6,3,4},{8,6,6,6}};
	int i,j,l,n,r=0,x=0;
	int arreglo[x],llamadoESPAR;
	
	//muestra de la matriz
	printf("Matriz cargada:\n");
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			printf("%d\t",M[i][j]);
		}
		printf("\n");
	}
	
	//recorro el arreglo para saber cuantos numeros son pares
	printf("\n");
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			l=M[i][j];
			llamadoESPAR = esPar(l);
			if(llamadoESPAR == 1){
				x++;
			}
		}
	}
	//ahora cargo el arreglo
	printf("\n");
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			l=M[i][j];
			llamadoESPAR = esPar(l);
			if(llamadoESPAR == 1){
				arreglo[r]=l;
				r++;
			}
		}
	}
	
	
	//cantidad de numeros pares cargados en el arreglo
	printf("\nCantidad de numeros pares cargados en el arreglo: %d",x);
	
	//ordeno de mayor a mnenor
	for(i=0; i<x;i++){
		for( j=0; j<x;j++){
			if(arreglo[j]< arreglo[j+1]){
				n = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1]=n;
				
			}
		}
	}

	//muestro el arreglo
	printf("\nArreglo ordenado de mayor a menor\n");
	for(i=0; i<x;i++){
		printf("%d    ",arreglo[i]);
	}
	
	return 0;
}

