#include <stdio.h>
#include <math.h>

int main() {
	int num1,num2,seleccion,operacion;
	printf("ingresa el primer numero: ");
	scanf("%d",&num1);
	printf("ingresa el segundo numero: ");
	scanf("%d",&num2);
	printf("1) SUMA\n2) RESTA\n3) MULTIPLICACION\n4) DIVISION\n");
	scanf("%d",&seleccion);
	switch(seleccion){
	case 1:
		operacion = num1+num2;
		break;
	case 2:
		operacion = num1 - num2;
		break;
	case 3:
		operacion = num1 * num2;
		break;
	case 4:
		operacion = num1 / num2;
		break;
	default:
		break;
	}
	printf("El resultado de su operación es: %d",operacion);
	return 0;
}

