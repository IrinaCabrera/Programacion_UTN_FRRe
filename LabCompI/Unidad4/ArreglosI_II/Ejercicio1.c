#include <stdio.h>
int arreglo [10], suma=0;
float promedio;
int main() {
	//carga de datos en el arreglo
	for(int i = 0; i <10; i++){
		printf("Ingrese el elemento en la posicion n° %d \n", i);
		scanf("%d", &arreglo[i]);
	}
	//suma de cada elemento
	for(int i = 0; i <10; i++){
		suma = suma + arreglo[i];
	}
	//promedio
	promedio= suma /10;
	//salidas
	printf("suma total: %d \n", suma);
	printf("promedio: %0.2f \n", promedio);
	
	return 0;
}

