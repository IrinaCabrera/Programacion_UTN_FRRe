#include <stdio.h>
//variables
int n, r;
//declaracion y definicion de la funcion recursiva.
int factorial(int n){
	if (n <=1){
		r =1;
	}else{
		//invocacion de la funcion pero con n-1.
		r = n * (factorial(n-1));
	}
	return r;
}

int main() {
	n = 0;
	printf("ingrese un numero: ");
	scanf("%d", &n);
	//llamado de la funcion recursiva.
	printf("\nel factorial es: %d", factorial(n));
	return 0;
}

