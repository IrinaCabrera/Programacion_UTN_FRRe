#include <stdio.h>
int n,llamadoSUMA, suma=0;

int lala(int n, int i){
	suma = suma + n;
	if (i == 9){
		printf("suma total: %d \n",suma);
	}
	return suma;
}
int main() {
	for(int i = 0; i < 10; i++){
		printf("Ingrese un numero: ");
		scanf("%d",&n);
		llamadoSUMA = lala(n,i);
	}
	return 0;
}

