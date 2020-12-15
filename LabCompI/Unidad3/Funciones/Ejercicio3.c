#include <stdio.h>
int n, n1, suma=0, llamadoMAYOR,i,mayor,llamadoMENOR, menor;
float llamadoPROM;
int MENOR(int n1, int i){
	if(i < 1){
		menor = n1;
	}else{
		if(menor > n1){
			menor = n1;
		}else{
			n1 = menor;
		}
	}
	return menor;
}
int MAYOR(int n1,int i){
	if (i < 1){
		mayor = n1;
	}else{
		if(mayor < n1){
			mayor = n1;
		}else{
			n1 = mayor;
		}
	}
	return mayor;
}
float promedio(int n, int n1){
	suma = suma + n1;
	float prom= suma /n;
	return prom;
}

int main() {
	printf("cantidad de numeros a ingresar: ");
	scanf("%d", &n);
	for(i = 0; i<n; i++){
		printf("ingrese el numero: ");
		scanf("%d", &n1);
		llamadoPROM= promedio(n, n1);
		llamadoMAYOR=MAYOR(n1, i);
		llamadoMENOR = MENOR(n1, i);
	}
	printf("\nel promedio es: %f", llamadoPROM);
	printf("\nel mayor es: %d", llamadoMAYOR);
	printf("\nel menor es: %d", llamadoMENOR);
	return 0;
}

