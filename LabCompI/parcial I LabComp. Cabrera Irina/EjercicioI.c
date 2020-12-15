#include <stdio.h>

int main() {
	//variables.
	int num1, num2, contador = 0;
	
	//ingreso de datos.
	printf("Ingrese el primer numero: ");
	scanf("%d",&num1);
	printf("Ingrese el segundo numero: ");
	scanf("%d",&num2);
	
	//si num1 es menor a num2
	if(num1 < num2){
		//recorrido de variables(de num1 a num 2).
		for(int i = num1; i<= num2; i++){
			
			//si un numero dentro del rango que va de num1 a num2 es sibisible por 2 con resto 0 entonces es par.
			if(i %2 == 0){
				printf("El numero par es: %d\n", i);
			}
			else{
				//cuenta cuantos numeros no son pares
				contador++;
			}
		}
	}
	//si num1 es mayor a num2
	else if(num2 < num1){
		//recorrido de variables(de num2 a num1).
		for(int i = num1; i>= num2; i--){
			//si un numero dentro del rango que va de num2 a num1 es sibisible por 2 con resto 0 entonces es par.
			if(i %2 == 0){
				//salida de dato
				printf("El numero par es: %d\n", i);
			}
			else{
				//cuenta cuantos numeros no son pares
				contador++;
			}
		}
	}
	else{		
		//en caso de ser ambos numeros iguales.
		printf("Ambos numeros son iguales, no hay numero pares entre ellos.");
	}
	//salida de dato.
	printf("La cantidad de numeros que no cumplen con esa condicion son: %d", contador);
	
	return 0;
}

