#include <stdio.h>

int main() {
	int soporte;
	int arr[10]={1,2,3,4,5,6,7,8,9,10};
	
	printf("arreglo original: \n");
	for(int i=0; i<10;i++){
		printf("%d\t",arr[i]);
	}
	
	soporte= arr[2];
	arr[2]=arr[9];
	arr[9]=soporte;
	
	printf("\narreglo modificado en la posicion 2 y 9: \n");
	for(int i=0; i<10;i++){
		printf("%d\t",arr[i]);
	}
	return 0;
}

