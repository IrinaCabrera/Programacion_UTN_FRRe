#include <stdio.h>
int A[8]={1,4,6,8,10,11,15,16},n,i,k,j;
int main() {
	printf("ingrese un numero: ");
	scanf("%d",&n);
	i=0;
	j=7;
	do{
		k=(i+j)/2;
		if(A[k]<=n){
			i=k+1;
		}
		if(A[k]>=n){
			j=k-1;
		}
	}while(i<=j);
	
	if(A[k]==n){
		printf("El elemento se encuentra en la posicion: %d",k);
	}else{
		printf("el elemento no ha sido encontrado");
	}
	
	return 0;
}

