#include <stdio.h>

int arreglo[10]={1,4,0,7,9,3,6,2,5,8},soporte,posicion,min;
char seleccion;
int main() {
	printf("Ordena un arreglo: {1,4,0,7,9,3,6,2,5,8} de menor a mayor utilizando diferentes metodos.\n");
	printf("a) Metodo de burbuja\nb) Metodo por insercion\n"
		   "c) Ordenamiento por seleccion\n");
	scanf("%c",&seleccion);
	
	//se ordena el arreglo por distintos metodos.
	switch(seleccion){
	//burbuja
	case 'a':
	case 'A':
		for(int i=0; i<9;i++){
			for(int j=0; j<9;j++){
				if(arreglo[j]> arreglo[j+1]){
					soporte = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1]=soporte;
				}
			}
		}
		break;
	//insercion
	case 'b':
	case 'B':
		for(int i=0; i<10;i++){
			posicion=i;
			soporte= arreglo[i];
			while((posicion>0)&&(arreglo[posicion-1])>soporte){
				arreglo[posicion]=  arreglo[posicion-1];
				posicion--;
			}
			arreglo[posicion]=soporte;
		}
		break;
	//seleccion
	case 'c':
	case 'C':
		for(int i=0; i<10;i++){
			min =i;
			for(int j=i;j<10;j++){
				if(arreglo[j]< arreglo[min]){
					min=j;
				}
			}
			soporte= arreglo[i];
			arreglo[i]=arreglo[min];
			arreglo[min]=soporte;
		}
		break;
	default:
		printf("ingreso invalido");
		break;
	}
	printf("Arreglo ordenado: ");
	for(int i=0; i<10;i++){
		printf("%d ",arreglo[i]);
	}
	return 0;
}

