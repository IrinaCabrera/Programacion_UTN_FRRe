#include <stdio.h>
int A[11]= {1,4,6,6,8,10,11,11,15,16,16},n,i,j,k;
char seleccion, ban='f';
int main() {
	printf("a) Realizar esta operacion utilizando busqueda comun.\n"
		   "b) Realizar esta operacion utilizando busqueda binaria.");
	scanf("%c",&seleccion);
	printf("ingrese un numero: ");
	scanf("%d",&n);
	
	
	switch(seleccion){
	//busqueda comun
	case 'a':
	case 'A':
		for(int i=0;i<11;i++){
			if(A[i]==n){
				printf("Elemento encontrado en la posición: %d\n",i);
				ban='v';
			}else if(i==10 && ban=='f'){
				printf("Elemento no encontrado");
			}
		}
		break;
	//busqueda binaria
	case 'b':
	case 'B':
		i=0;
		j=10;
		
		do{
			k=(i+j)/2;
			if(A[k]==n){
				printf("\nEl elemento se encuentra en la posicion: %d",k);
				ban ='v';
				i=k+1;
			}else{
				if(A[k]<=n){
					i=k+1;
				}
				if(A[k]>=n){
					j=k-1;
				}
			}
		}while(i<=j);
		if(ban=='f'){
			printf("El elemento no ha sido encontrado.");
		}
		break;
	default:
		printf("El ingreso es invalido.");
		break;
	}
	
	return 0;
}

