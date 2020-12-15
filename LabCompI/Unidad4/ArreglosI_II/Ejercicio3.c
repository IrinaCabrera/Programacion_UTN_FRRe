#include <stdio.h>

int main() {
	
	int min = -10000, max =10000, lista[10]={15,1000,-10010,100,50000,4000,-17000,20,78,2000};
	int a = 0;
	float promedio;
	for(int i = 0; i <10; i++){
		if (lista[i]<min){
			min = lista[i];
		}else if(lista[i]>max){
			max=lista[i];
		}
	}
	printf("el numero mayor es: %d y el numero menor es: %d", max, min);
	for(int i = 0; i <10; i++){
		a=a+lista[i];
	}
	promedio=a/10;
	printf("\nel promedio es %f", promedio);
	return 0;
}

