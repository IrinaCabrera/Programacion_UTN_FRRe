#include <stdio.h>

int main() {
	int arreglo [10] = {1,6,6,4,7,10,9,20,8,30}, cont=0, cont2=0;
	//cuento cuantos elementos son multiplos de 3 y lso separo con el resto
	for(int i=0; i<10; i++){
		if(arreglo[i]%3==0){
			cont++;
		}else{
			cont2++;
		}
	}
	//armo el arreglo con el tamaño
	int multiploTres[cont];
	int restoValores[cont2];
	
	//cargo los valores en cada arreglo que acabo de crear
	cont=0;
	cont2=0;
	for(int i=0; i<10; i++){
		if(arreglo[i]%3==0){
			multiploTres[cont]= arreglo[i];
			cont++;
		}else{
			restoValores[cont2] = arreglo[i];
			cont2++;
		}
	}
	//imprimo cada arreglo
	printf("Elementos del arreglo original\n");
	for(int i=0; i<10; i++){
		printf("%d\t",arreglo[i]);
	}
	printf("\n");
	printf("Elementos del arreglo que incluye los numeros que son multiplo de tres\n");
	for(int i=0; i<cont; i++){
		printf("%d\t",multiploTres[i]);
	}
	printf("\n");
	printf("Elementos del arreglo que incluye los numeros que sobran\n");
	for(int i=0; i<cont2; i++){
		printf("%d\t",restoValores[i]);
	}
	return 0;
}

