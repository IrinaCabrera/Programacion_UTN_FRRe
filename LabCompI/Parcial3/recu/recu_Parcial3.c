#include <stdio.h>
int par(int l){
	if(l%2==0){
		return 1;
	}else{
		return 3;
	}
}
void ordenamiento(int arreglo[],int aux, int i, int j){
	//ordenamiento por inserción
	for(i=0;i<10;i++){
		j=i; //j es la posicion
		aux=arreglo[i];
		
		//sigo comparando mientras la posicion sea mayor a cero
		while((j>0)&&(arreglo[j-1] > aux)){
			arreglo[j]=arreglo[j-1];
			j--;
		}
		arreglo[j]=aux;
	}
}
int main() {
	int n=0,p,i,control=0,aux=0,j=0,l,t=0,k=0;
	int arreglo[10],llamadoPAR,M[2][2]={{0,0},{0,0}};
	
	//cargamos es arreglo
	while(n<10){
	
		printf("Ingrese el %d elemento del arreglo: ",n+1);
		scanf("%d",&p);
		
		//si es MENOR a 0 entonces vuelve a pedir el elemento de ese lugr del arreglo
		if(p<=0){
			control=1;
			
		}else{
			
			//en caso de no ser menor a 0 entonces recorre el arreglo para comprobar 
			//si el numero ingresado está dentro del arreglo
			//si no está entonces lo agrega al arreglo, y si está entonces vuelve a agregar ese lugar
			//la variable control em ayuda a saber cuando agregar un elemento al arreglo
			//mediante el control que ejerce sobre el lunar determinado por la variable n y el valor de p
			for(i=0;i<10;i++){
				if(arreglo[i]==p){
					control=1;
				}
			}	
		}
		
		if(control == 0){
			arreglo[n]=p;
			n++;
		}else{
			n++;
			n--;
		}
		control=0;
	}
	//muestro arreglo:
	printf("\nArreglo:\n");
	for(i=0;i<10;i++){
		printf("%d\n",arreglo[i]);
	}
	
	//ordenamiento del arreglo de menor a mayor
	ordenamiento(arreglo,aux,i,j);
	
	//muestro arreglo ordenado:
	printf("\nArreglo ordenado de menor a mayor:\n");
	for(i=0;i<10;i++){
		printf("%d\n",arreglo[i]);
	}
	printf("\n");
	
//es par??
	for(i=0;i<10;i++){
		l=arreglo[i];
		llamadoPAR=par(l);
		//si es 1 entonces, cargo al matriz
		//carga solamente los primeros elementos pares.
		if(llamadoPAR == 1){
			//M[0][0]
			if(t==0 && k==0){
				M[t][k]=l;
				k++;
			}
			//M[0][1]
			else if(t==0 && k==1){
				M[t][k]=l;
				t++;
				k--;
			}
			//M[1][0]
			else if(t==1 && k==0){
				M[t][k]=l;
				k++;
			}
			//M[1][1]
			else if(t==1 && k==1){
				if(M[t][k]==0){
					M[t][k]=l;
				}
				
			}
			
		}
	}
	//si ya no se cargó el primer elemento
	//entonces los demás están vacíos y significaría que el arreglo no pudo ser cargado
	if(M[0][0]==0){
		printf("\n**La matriz no pudo ser cargada. El arreglo no contiene numeros pares.**");
	}else{
		//si la matriz no está vacía entonces muestara por pantalla
		printf("\nMatriz cargada:\n");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				printf("%d\t",M[i][j]);
			}
			printf("\n");
		}
	}
	return 0;
}

