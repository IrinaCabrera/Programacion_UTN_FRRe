#include <stdio.h>
int A[8]= {5,4,10,8,2,11,9,1},n;
int main() {
	printf("ingrese un numero: ");
	scanf("%d",&n);
	for(int i=0;i<8;i++){
		if(A[i]==n){
			printf("Elemento encontrado en la posición: %d",i);
			break;
		}else if(i==7 && A[i]!=n){
			printf("Elemento no encontrado");
		}
	}
	return 0;
}

