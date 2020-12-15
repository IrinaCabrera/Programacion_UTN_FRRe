#include <stdio.h>
int arreglo[10],i,n,soporte,cont=0,j,suma=0;
char bandera='f';
float promedio;
//funcion burbuja
int burbuja(int arreglo[10]){
	for(i=0; i<10;i++){
		for( j=0; j<10;j++){
			if(arreglo[j] < arreglo[j+1]){
				soporte = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1]=soporte;
			}
		}
	}
	return arreglo[10];
}
//eliminacion de lugares
int eliminacion(int arreglo[10]){
	for(i=0;i<10;i++){
		if(i<9 && arreglo[i]==arreglo[i+1]){
			//en el lugar repetido se cambiará por cero
			arreglo[i]=0;
			cont++;
			//por si quieres saber cuales lugares son dejo esto:
			//printf("lugar : %d\n",i);
		}
	}
	printf("\n%d lugares han sido eliminados",cont);
	return 0;
}
//busqueda
int bus(int n,int arreglo[10],int bandera){
	//realizo una busqueda para saber si el elemento se encuentra en la poscicion
	//si no se encuentra entonces lo agrega en la posicion respectiva
	//si se encuentra no lo agreg al arreglo y esas posiciones quedan vacías.
	for(i=0; i<10; i++){
		if(n==arreglo[i]){
			bandera='v';
		}
	}
	if(bandera=='f'){
		arreglo[j]=n;
	}
	return 0;
}
//elementos mayores al promedio
int mayProm(int arreglo[10],float promedio){
	printf("\nElementos del arreglo mayores al promedio: ");
	for(i=0; i<10;i++){
		if(arreglo[i]>promedio){
			printf("\n%d",arreglo[i]);
		}
	}
	return 0;
}	
int main() {
	//carga de elementos
	for(i=0; i<10;i++ ){
		printf("ingrese los elementos del arreglo: ");
		scanf("%d",&n);
		arreglo[i]=n;
	}
	//llamado de la funcion burbuja para ordenar el arreglo
	burbuja(arreglo);
	//Eliminacion de lugares
	eliminacion(arreglo);
	//vuelvo a ordenar
	burbuja(arreglo);
	
	//muestra del arreglo hasta ahora
	printf("\nArreglo ordenado con elementos eliminados de haberlo:");
	for(i=0; i<10;i++){
		printf("\n%d",arreglo[i]);
	}
	
	//ingreso de valores de manera ordenada y verifico si el elemento se encuentra o no en la posicion
	int ayuda= (9-cont)+1;
	for(j=ayuda; j<=9;j++){
		printf("\ningrese el elemento en el lugar %d: ",(j+1));
		scanf("%d",&n);
		//busqueda
		bus(n,arreglo,bandera);
	}
	//calcular la suma
	for(i=0; i<10;i++){
		suma=suma+arreglo[i];
	}
	printf("\nsuma: %d",suma);
	//promedio
	promedio= suma/10;
	printf("\npromedio: %f",promedio);
	
	//elementos que son mayores al promediode los 10 enteros declarados.
	mayProm(arreglo,promedio);
	//muestra del arreglo final
	printf("\nArreglo final:");
	for(i=0; i<10;i++){
		printf("\n%d",arreglo[i]);
	}
	return 0;
}

