#include <stdio.h>
//carga de elementos en la declaracion.
int arreglo [10] = {1,6,6,4,7,10,11,20,8,19};
int suma;
float promedio;
int main() {
	//suma de cada elemento
	for(int i = 0; i <10; i++){
		suma = suma + arreglo[i];
	}
	//promedio
	promedio= suma /10;
	printf("promedio: %0.2f \n", promedio);
	//mayor al promedio
	printf("Arreglos mayores al promedio:\n");
	for(int i =0; i <10; i++){
		if(arreglo[i]>promedio){
			printf("%d\n",arreglo[i]);
		}
	}
	
	return 0;
}

