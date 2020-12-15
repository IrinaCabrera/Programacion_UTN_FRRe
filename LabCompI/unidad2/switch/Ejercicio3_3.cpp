#include <stdio.h>

int main() {
	//3_2 CALCULADORA
	char seleccion,contador=0;
	float operacion=0,valoresOPERACION,num=0;
	float dividendo,divisor;
	printf("s para suma, r para resta, m para multiplicacion, d para division\n");
	scanf("%c",&seleccion);
	switch(seleccion){
	//SUMA//
	case 'S':
	case 's':
		printf("cuantos valores quiere ingresar?");
		scanf("%f",&valoresOPERACION);
		while(contador < valoresOPERACION){
			printf("ingrese cada valor\n");
			scanf("%f",&num);
			operacion= operacion+num;
			contador++;
		}
		printf("la suma es: %f\n", operacion);
		break;
	//RESTA//
	case 'R':
	case 'r':
		printf("cuantos valores quiere ingresar?");
		scanf("%f",&valoresOPERACION);
		while(contador < valoresOPERACION){
			while(contador < 1){
				printf("ingrese el numero: ");
				scanf("%f",&num);
				operacion = num;
				contador++;
			}
			printf("ingrese el siguiente numero\n");
			scanf("%f",&num);
			operacion=operacion-num;
			contador++;
		}
		printf("la resta es: %f\n", operacion);
		break;
	//MULTIPLICACION//
	case 'M':
	case 'm':
		printf("cuantos valores quiere ingresar?");
		scanf("%f",&valoresOPERACION);
		while(contador < valoresOPERACION){
			if(contador < 1){
				printf("ingrese cada valor\n");
				scanf("%f",&num);
				operacion = num;
			}
			else{
				printf("ingrese cada valor\n");
				scanf("%f",&num);
				operacion= operacion*num;
			}
			contador++;
		}
		printf("la multiplicacion es: %f\n", operacion);
		break;
	//DIVISION//
	case 'D':
	case 'd':
		printf("cuantos valores quiere ingresar?");
		scanf("%f",&valoresOPERACION);
		while(contador < valoresOPERACION){
			while(contador < 1){
				printf("ingrese el dividendo: \n");
				scanf("%f",&dividendo);
				printf("ingrese el divisor: \n");
				scanf("%f",&divisor);
				operacion = dividendo/divisor;
				printf("hasta ahora el resultado es asi: %f\n",operacion);
				contador++;
			}
			printf("ingrese el siguiente valor que ahora será el divisor: \n");
			scanf("%f",&divisor);
			operacion=operacion/divisor;
			printf("hasta ahora el resultado es asi: %f",operacion);
			contador++;
		}
		printf("la division es: %f\n", operacion);
		break;
	default:
		printf("Ingreso no valido, intente mas tarde...");
		break;
	}
	return 0;
}

