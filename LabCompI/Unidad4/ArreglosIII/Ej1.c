#include <stdio.h>
//Arreglo creado de tamaño 15, con 8 lugares ocupados (de cero a siete)
//Es un arreglo ordenado sin elementos repetidos.
int A[15]= {1,4,6,8,10,11,15,16}, n, lugar;
//esto me servira para saber si debo pasar o no por el proceso de corrido de lugar.
char bandera= 'f';
int main() {
	//muestro el arreglo antes de odificarlo:
	printf("Arreglo Ahora:\n");
	for(int i=0; i<15;i++){
		printf("%d    ",A[i]);
	}
	//ingreso y almacenamiento de dato.
	printf("\nIngrese el numero a ubicar: ");
	scanf("%d",&n);
	
	//recorro el arreglo
	for(int i=0; i<15;i++){
		//Si el numero ingresado es menor al numero que se encuentra en la posicion i
		//guarda la posicion en la que deberia estar
		if(n < A[i]){
			lugar = i;
			//ya encontré el lugar, salgo.
			bandera = 'v';
			break;
		}
		//si el numero ingresado es igual a un elemento del arreglo.
		if(n == A[i]){
			bandera = 'f';
			//me aseguro de que no lo agregue con un braeak;
			break;
		}
		//si el numero ingresado supera al ultimo lugar, entonces es agregado despues del ultimo elemento.
		if(n >A[7]){
			A[8]=n;
			bandera = 'f';
		}
	}
	if(bandera == 'v'){
		//cambiar de lugar los elementos que vienen despues de lugar
		for(int i= 14; i > lugar; i--){
			A[i]=A[i-1];
		}
		//ahora puedo reemplazar el valor ingresado al lugar que corresponde
		A[lugar]=n;
	}
	//muestro el arreglo modificado:
	printf("Arreglo terminado:\n");
	for(int i=0; i<15;i++){
		printf("%d    ",A[i]);
	}
	
	return 0;
}

