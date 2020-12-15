#include <stdio.h>
int n1=1,n2=1,n3=1,llamadoFIBONACCI;
int fibonacci(int i){
	if(i <= 2){
		printf("\nnumero: %d",n3);
		printf("\torden: %d",i);
	}else{
		n2 = n1;
		n1 = n3;
		n3= n1+n2;
		printf("\nnumero: %d",n3);
		printf("\torden: %d",i);
	}
	
}
int main() {
	for(int i=1; i<16; i++){
		llamadoFIBONACCI=fibonacci(i);
	}
	return 0;
}

