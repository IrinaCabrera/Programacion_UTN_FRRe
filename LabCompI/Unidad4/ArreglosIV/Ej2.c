#include <stdio.h>
int arreglo[10]={5,55,1,11,2,22,8,88,4,44}, invBurbuja,i,j,soporte,suma;
float promedio;
//funcion burbuja
int burbuja(int arreglo[10]){
	for(int i=0; i<10;i++){
		for( j=0; j<10;j++){
			if(arreglo[j] < arreglo[j+1]){
				soporte = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1]=soporte;
			}
		}
	}
	return arreglo[10];
}
int promMay(int arreglo[10],float promedio){
	printf("\nelementos mayores al promedio:");
	for(i=0;i<10;i++){
		if(arreglo[i]>promedio){
			printf("\n%d",arreglo[i]);
		}
	}
	return 0;
}
int main() {
	//llamado de la funcion burbuja
	invBurbuja=burbuja(arreglo);
	
	//suma y promedio
	for(i=0; i<10;i++){
		suma=suma+arreglo[i];
	}
	printf("suma: %d",suma);
	
	//promedio
	promedio= suma/10;
	printf("\npromedio: %f",promedio);
	
	//elementos mayores al promedio
	promMay(arreglo,promedio);
	return 0;
}

