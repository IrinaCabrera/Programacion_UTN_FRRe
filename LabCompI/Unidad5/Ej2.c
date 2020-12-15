#include <stdio.h>
int M[3][3],N[3][3],i,j,n,k,l,m,cont=9,SMN[3][3],RMN[3][3],MULMN[3][3],clave;

//multioperacion
int todoTerreno(int M[3][3],int N[3][3],int clave){
	//M+N,M-N,M*N
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			for(m=1;m<2;m++){
				if(clave==1){
					SMN[i][j]=M[i][j]+(N[i][j]);
				}
				if(clave==2){
					RMN[i][j]=M[i][j]-(N[i][j]);
				}
				if(clave==3){
					j=0,k=0;
					for(i=0;i<9;i++){
						MULMN[0+k][0+j]=M[0+k][0]*(N[0][0+j])+(M[0+k][1]*(N[1][0+j]))+(M[0+k][2]*(N[2][0+j]));
						j++;
						if(i==2 || i==5){
							k++;
							j=0;
						}
					}
				}
			}
		}
	}
	//muestro
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(clave==1){
				printf("%d\t",SMN[i][j]);
			}
			if(clave==2){
				printf("%d\t",RMN[i][j]);
			}
			if(clave==3){
				printf("%d\t",MULMN[i][j]);
			}
			if(clave==4){
				printf("%d\t",M[i][j]);
			}
			if(clave==5){
				printf("%d\t",N[i][j]);
			}
		}
		printf("\n");
	}
	return 0;
}
int main() {
	//cargar cada matriz M
	printf("Para la matriz M\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("ingrese el valor de la fila %d y columna %d: ",i+1,j+1);
			scanf("%d",&n);
			M[i][j]=n;
		}
	}
	//cargar matriz N
	printf("Para la matriz N\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("ingrese el valor de la fila %d y columna %d: ",i+1,j+1);
			scanf("%d",&n);
			N[i][j]=n;
		}
	}
	//muestro ambas matrices
	printf("matriz M\n");
	todoTerreno(M,N,4);
	//muestro ambas matrices
	printf("matriz N\n");
	todoTerreno(M,N,5);
	//comparacion de matrices
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			for(m=1;m<2;m++){
				if(M[i][j]==N[i][j]){
					cont--;
				}
			}
		}
	}
	if(cont==0){
		printf("las matrices son iguales\n");
	}else{
		printf("las matrices NO son iguales\n");
	}
	//M+N
	printf("M+N:\n");
	todoTerreno(M,N,1);
	//M-N
	printf("M-N:\n");
	todoTerreno(M,N,2);
	//M*N
	printf("M*N:\n");
	todoTerreno(M,N,3);
	return 0;
}

