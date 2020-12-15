#include <stdio.h>
int f, c, i, j, llamTP;
int triangulo(int f, int c){
	//casos base
	if(f==c||c==0){
		return 1;
	}else{
		return triangulo(f-1,c-1)+triangulo(f-1,c);
	}
}
int triangPascal(){
	for(i=0; i<10; i++){
		for(j=0; j<=i; j++){
			printf(" %d ", triangulo(i,j));
		}
		printf("\n");
	}
}

int main() {
	llamTP = triangPascal();
	return 0;
}

