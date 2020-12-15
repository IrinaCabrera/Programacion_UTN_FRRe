#include <stdio.h>
int A[3][3]={{2,1,-1},{1,3,-4},{2,6,-8}},B[3][1]={1,2,4},i=0,j=0,pivote,valor,cont=0,cont2=0,cont3=0;
char X[3][1]={'x','y','z'};
//matrices auxiliares
int M1[3][4]={{2,1,-1,1},{1,3,-4,2},{2,6,-8,4}},M2[3][4]={{2,1,-1,1},{0,0,0,0},{0,0,0,0}},M3[3][4];
int M[3][3],n=3,noNull=3,noNull2=3;

int main() {
	printf("Matriz A:\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%d\t",A[i][j]);
		}
		printf("\n");
	}
	printf("Matriz X:\n");
	for(i=0;i<3;i++){
		for(j=0;j<1;j++){
			printf("%c\t",X[i][j]);
		}
		printf("\n");
	}
	printf("Matriz B:\n");
	for(i=0;i<3;i++){
		for(j=0;j<1;j++){
			printf("%d\t",B[i][j]);
		}
		printf("\n");
	}
	//teorema
	printf("Resolucion con el Teorema de Rouche-Frobenius:\n");
	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			printf("%d\t",M1[i][j]);
		}
		printf("\n");
	}
	
	pivote=M1[0][0];
	j=0;
	//segunda linea de m2
	for(i=0;i<3;i++){
		valor=(pivote*M1[1][1+j])-(M1[1][0]* M1[0][1+j]);
		M2[1][1+j]=valor;
		j++;
	}
	//tercera linea de m2
	j=0;
	for(i=0;i<3;i++){
		valor=(pivote*M1[2][1+j])-(M1[2][0]* M1[0][1+j]);
		M2[2][1+j]=valor;
		j++;
	}
	printf("__\t__\t__\t__\n");
	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			printf("%d\t",M2[i][j]);
		}
		printf("\n");
	}
	
	//cargo M3 con M2
	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			M3[i][j]=M2[i][j];
		}
	}
	//pongo 0 en [2][1]de M2
	M3[2][1]=0;
	
	pivote=M2[1][1];
	j=0;
	
	for(i=0;i<2;i++){
		printf("j %d\n",j);
		valor=(pivote*(M2[2][2+j]))-(M2[2][1]* (M2[1][2+j]));
		M3[2][2+j]=valor;
		j++;
	}
	
	printf("__\t__\t__\t__\n");
	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			printf("%d\t",M3[i][j]);
		}
		printf("\n");
	}
	//cargo las matrices:
	//M (matriz reducida)
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			M[i][j]=M3[i][j];
		}
	}
	//contamos filas no nulas de matriz ampliada que es M3:
	cont=0;
	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			if(M3[i][j]==0){
				cont++;
			}
		}
		if(cont==4){
			cont2++;
		}
		cont=0;
	}
	noNull-=cont2;
	printf("cantidad de filas no nulas de M': %d\n",noNull);
	//contamos filas nulas de M (matriz reducida)
	cont=0;
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(M[i][j]==0){
				cont++;
			}
		}
		if(cont==3){
			cont3++;
		}
		cont=0;
	}
	noNull2-=cont3;
	printf("cantidad de filas no nulas de M: %d\n",noNull2);
	printf("n° de incognitas = %d\n",n);
	//condiciones
	printf("Clasificacion:\n");
	if(noNull==noNull2){
		if(noNull2==n){
			printf("Sistema compatible determinado.");
		}else{
			printf("Sistema compatible indeterminado.");
		}
		
	}else{
		printf("Sistema incompatible.");
	}

	return 0;
}

