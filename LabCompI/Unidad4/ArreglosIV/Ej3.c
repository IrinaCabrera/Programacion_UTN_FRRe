#include <stdio.h>
int arreglo[10]={1,6,9,11,22,33,666,777,69},i,j,l,min,soporte,resto,contlugarvacio=0;
int arregloMul[10],arregloNoMul[10],n,cont=0;
char bandera='f';
//arreglo con multiplos
int multiplo(int arregloMul[10],int arregloNoMul[10]){
	j=0;
	l=0;
	for(i=0; i<10;i++){
		resto=arreglo[i]%3;
		if(resto==0){
			arregloMul[j]=arreglo[i];
			j++;
		}else{
			arregloNoMul[l]=arreglo[i];
			l++;
		}
	}
	printf("Arreglo con multiplos");
	for(i=0; i<10;i++){
		printf("\n%d",arregloMul[i]);
	}
	printf("\nArreglo sin multiplos");
	for(i=0; i<10;i++){
		printf("\n%d",arregloNoMul[i]);
	}
	return 0;
}
//metodo seleccion para el ordenamiento
int seleccion(int arregloMul[10]){
	for(i=0; i<10;i++){
		min =i;
		for(j=i;j<10;j++){
			if(arregloMul[j]< arregloMul[min]){
				min=j;
			}
		}
		soporte= arregloMul[i];
		arregloMul[i]=arregloMul[min];
		arregloMul[min]=soporte;
	}
	return arregloMul[10];
}
int agregar(int arregloMul[10],int n){
	//contador de arregloMul
	for(j=0;j<=cont;j++){
		if(arregloMul[j]>=n && n%3==0){
			bandera='v';
		}
	}
	return bandera;
}
int main() {
	//llamo a la funcion multiplo
	multiplo(arregloMul,arregloNoMul);
	
	//ordenamiento del areglo multiplo
	seleccion(arregloMul);
	
	//muestro el arreglo de multiplo ordenado
	printf("\narreglo con multiplos ordenados:");
	for(i=0;i<10;i++){
		printf("\n%d",arregloMul[i]);
	}
	//agregar multiplos de tres hasta completar el arreglo:
	//cuenta los lugares vacíos
	for(i=0;i<10;i++){
		if(arregloMul[i]==0){
			cont++;
		}
	}
	//lugares por ser agregados:
	//ingreso de valores:
	for(i=cont-1;i>=0;i--){
		printf("\nIngrese el elemento del lugar %d: ",(i+1));
		scanf("%d",&n);
		agregar(arregloMul,n);
		if(bandera=='v'){
			arregloMul[i]=n;
		}
	}
	//arreglo final de arregloMul
	printf("\narreglo final de arregloMul");
	for(i=0;i<10;i++){
		printf("\n%d",arregloMul[i]);
	}
	
	//cuantos lugares fueron agregados:
	for(i=0;i<10;i++){
		if(arregloMul[i]==0){
			contlugarvacio++;
		}
	}
	printf("\nSe agregaron %d lugares",cont-contlugarvacio);
	
	return 0;
}

