#include <stdio.h>
int n, n1, llamadoPRIMO,cont=0,contador=0, contlista=0, llamLP, num;

int listaPRIMO(int n1){
	contador=0;
	for(int i=1; i<=n1; i++){
		if(n1%i == 0){
			contador++;
			if(n1 == 1){
				contador++;
			}
		}
	}
	if(contador == 2){
		contlista++;
	}
	return contlista;
}
int primo(int n){
	for(int i=1; i<=n; i++){
		if(n%i == 0){
			cont++;
			if(n == 1){
				cont++;
			}
		}
	}
	if(cont == 2){
		num = 1;
	}else{
		num = 0;
	}
	return num;
}
int main() {
	printf("ingrese el numero para saber si es primo: ");
	scanf("%d",&n);
	llamadoPRIMO = primo(n);
	printf("%d", llamadoPRIMO);
	
	printf("\ningrese una lista de numeros para saber cuanto de ellos son primos: ");
	do{
		printf("\nNumero: ");
		scanf("%d",&n1);
		llamLP = listaPRIMO(n1);
	}while(n1!=0);
	printf("\ncantidad numeros primos: %d", llamLP);
	return 0;
}

