#include <stdio.h>
int A[10]={10,12,3,40,15,60,17,18,91,11},B[10]={111,2,13,14,51,16,71,80,19,20},C[20];
int i,j,soporte,n,inf,sup,mitad;
char bandera='f';
int newVector(int A[10],int B[10]){
	//llenado del vector C[10]
	j=0;
	for(i=0;i<10;i++){
		C[j]=A[i];
		j++;
		C[j]=B[i];
		j++;
	}
	return C[20];
}
//burbuja para odenar
int vectorOrdenado(int C[10]){
	for(i=0; i<19;i++){
		for( j=0; j<19;j++){
			if(C[j]> C[j+1]){
				soporte = C[j];
				C[j] = C[j+1];
				C[j+1]=soporte;
			}
		}
	}
	return C[20];
}
//BUSQUEDA BINARIA
int busqueda(int C[20],int n){
	inf=0;
	sup=20;
	while((inf+1)!=sup){
		mitad=(inf+sup)/2;
		if(C[mitad]==n){
			bandera='v';
			break;
		}
		if(C[mitad]>n){
			sup=mitad;
			mitad=(inf+sup)/2;
		}
		if(C[mitad]<n){
			inf=mitad;
			mitad=(inf+sup)/2;
		}
	}
	if(bandera=='v'){
		printf("El elemento ha sido encontrado en la posicion %d",mitad+1);
	}
	else{
		printf("El elemento no ha sido encontrado");
	}
	return 0;
}
int main() {
	//devuelve el vector C
	newVector(A,B);
	//ordena el vector C
	vectorOrdenado(C);
	//ingreso
	printf("\nIngresa un numero: ");
	scanf("%d",&n);
	//devuelve la posicion del elemento de ser encontrado
	busqueda(C,n);
	
	printf("\nMuestra del vector ORDENADO:\n");
	for(i=0;i<20;i++){
		printf("%d\n",C[i]);
	}
	return 0;
}

