#include <stdio.h>
int n, n1, producto, llamado,i;
int arreglo[1];
int prod(int n1,int i){
	
	if(i > 0){
		producto = producto * n1;
	}else{
		producto= 1*n1;
	}
	return producto;
}
int main() {
	printf("Cuantos numeros ingresará? ");
	scanf("%d",&n);
	
	for( i=0; i<n; i++){
		printf("ingrese el numero: \n");
		scanf("%d",&n1);
		arreglo[i]= n1;
		llamado=prod(n1,i);
	}
	printf("el producto es: %d\n",llamado);
	for(int a = 0; a <n ; a++){
		printf("los numeros ingresados son: %d\n", arreglo[a]);
	}
	
	return 0;
}

