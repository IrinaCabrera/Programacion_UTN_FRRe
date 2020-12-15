#include <stdio.h>

//filas x columnas
int M[4][4],i,n,j,suma=0,contador=0,MT[4][4],contador2=0,k,contador3=0;
float promedio;

//cantidad de numeros pares de M
int par(int M[4][4]){
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			if(M[j][i]%2==0){
				contador2++;
			}
		}
	}
	return contador;
}
//mostrar numeros primos de M
int primo(int M[4][4]){
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			for(k=1;k<=M[i][j];k++){
				if(M[i][j]%k==0){
					if(M[i][j]==1&& k==1){
						contador3+=2;
					}else{
						contador3++;
					}
				}
			}
			if(contador3==2){
				printf("\n %d de la fila %d y columna %d Es un numero primo",M[i][j],i+1,j+1);
			}
			contador3=0;
		}
		
	}
	return 0;
}
int main() {
	//carga de matriz
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			printf("ingrese el valor de la fila %d y columna %d: ",i+1,j+1);
			scanf("%d",&n);
			M[i][j]=n;
		}
	}
	
	//muestra de la matriz
	printf("Matriz cargada:\n");
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			printf("%d\t",M[i][j]);
		}
		printf("\n");
	}
	
	//suma
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			suma+=M[i][j];
		}
	}
	printf("SUMA: %d",suma);
	
	//promedio
	promedio = (float)suma/16;
	printf("\nPROMEDIO: %.2f",promedio);
	
	//cuantas veces aparece el numero en la matriz
	printf("\nIngrese un numero para saber cuantas veces aparece en la matriz: ");
	scanf("%d",&n);
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			if(n==M[i][j]){
				contador++;
			}
		}
	}
	printf("El valor aparece %d vez/veces en la matriz\n",contador);
	
	//matriz transpuesta MT[4][4]:
	printf("Matriz transpuesta\n");
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			MT[j][i]=M[i][j];
		}
	}
	//muestra de la matriz
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			printf("%d\t",MT[i][j]);
		}
		printf("\n");
	}
	//cant numeros pares de M
	par(M);
	printf("La cantidad de numeros pares en la Matriz es de: %d",contador2);
	//numeros primos
	primo(M);
	return 0;
}

