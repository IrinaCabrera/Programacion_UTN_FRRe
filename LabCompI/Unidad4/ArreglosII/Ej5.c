#include <stdio.h>
int A[11]= {5,4,10,8,2,11,9,1,5,11,1},n;
char ban ='f';
int main() {
	printf("ingrese un numero: ");
	scanf("%d",&n);
	for(int i=0;i<11;i++){
		if(A[i]==n){
			printf("Elemento encontrado en la posición: %d\n",i);
			ban='v';
		}else if(i==10 && ban=='f'){
			printf("Elemento no encontrado");
		}
	}
	return 0;
}

