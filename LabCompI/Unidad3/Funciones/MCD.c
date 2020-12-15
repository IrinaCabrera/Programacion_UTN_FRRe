#include <stdio.h>
int x, y, llamMCD;
int mcd(int x, int y){
	if(y==0){
		return x;
	}else{
		//Recursividad
		return mcd(y,x%y);
	}
}
int main() {
	printf("Ingrese el valor de x: ");
	scanf("%d", &x);
	printf("Ingrese el valor de y: ");
	scanf("%d", &y);
	llamMCD = mcd(x,y);
	printf("el MCD de x es: %d y el de y es: %d", x, y, llamMCD);
	return 0;
}

