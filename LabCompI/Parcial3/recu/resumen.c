#include <stdio.h>

int main() {
	//matrices
	//carga manualmente
	int A[3][3]={{2,1,-1},{1,3,-4},{2,6,-8}};
	char X[3][1]={'x','y','z'};
	//carga con scanf
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			printf("ingrese el valor de la fila %d y columna %d: ",i+1,j+1);
			scanf("%d",&n);
			M[i][j]=n;
		}
	}
	
	//arreglos
	//busqueda de un elemento
	for(int i=0;i<11;i++){
		if(A[i]==n){
			printf("Elemento encontrado en la posición: %d\n",i);
			ban='v';
		}else if(i==10 && ban=='f'){
			printf("Elemento no encontrado");
		}
	}
	//ordenamiento burbuja de menor a mayor de 10 elementos
	for(i=0; i<x;i++){
		for( j=0; j<x;j++){
			if(arreglo[j]> arreglo[j+1]){
				n = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1]=n;
			}
		}
	}
	//de mayor a menor
	for( i=0; i<10;i++){
		for( j=0; j<10;j++){
			if(arreglo[j]< arreglo[j+1]){
				n = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1]=n;
				
			}
		}
	}
	//corre un lugar hacia la derecha de cada elemento de un arreglo
	//hago un lugar para insertar al inicio para todos los arreglos
	for(i=15;i>=0;i--){
		//para arreglo A
		A[i]=A[i-1];
		//para arreglo B
		B[i]=B[i-1];
		//para arreglo C
		C[i]=C[i-1];
		//para arreglo D
		D[i]=D[i-1];
	}
	//cadenas
	//cadena al reves
	/*strcpy()copia dos strings; 
	strcat()agrega una cadena a otra; 
	strcmp()compara una cadena con otra; 
	strchcr()localiza primera instancia de un caracter  dentro de un  string; 
	strstr()localiza la primera ocurrencia de un   string dentro de otro; 
	strlen()determina la longitud de un string. 
	
	isalnum(caracter):devuelvecierto(unenterocualquieradistintodecero)sicaracteresunaletraodígito,yfalso(elvalorentero0)encasocontrario.
	isalpha(caracter):devuelveciertosicaracteresunaletra,yfalsoencasocontrario.
	isblank(caracter):devuelveciertosicaracteresunespacioenblancoountabulador.
	isdigit(caracter)devuelveciertosicaracteresundigito,yfalsoencasocontrario.
	isspace(caracter):devuelveciertosicaracteresunespacioenblanco,unsaltodelínea,unretornodecarro,untabulador,etc.,yfalsoencasocontrario.
	islower(caracter):devuelveciertosicaracteresunaletraminúscula,yfalsoencasocontrario.
	isupper(caracter):devuelveciertosicaracteresunaletramayúscula,yfalsoencasocontrario.
	toupper(caracter):devuelvelamayúsculaasociadaacaracter,silatiene;sino,devuelveelmismocaracter.
	tolower(caracter):devuelve la minúscula asociada a caracter, si la tiene; si no, devuelve el mismo caracter.
	isalnum(caracter):devuelve cierto (un entero cualquiera distinto de cero) si caracter es una letra o dígito, y falso (el valor entero 0) en caso contrario.
	isalpha(caracter):devuelve cierto si caracter es una letra, y falso en caso contrario.
	isblank(caracter):devuelve cierto si caracter es un espacio en blanco o un tabulador.
	isdigit(caracter)devuelve cierto si caracter es un digito, y falso en caso contrario.
	isspace(caracter):devuelve cierto si caracter es un espacio en blanco, un salto de línea, un retorno de carro, un tabulador, etc., y falso en caso contrario.
	islower(caracter):devuelve cierto si caracter es una letra minúscula, y falso en caso contrario.
	isupper(caracter):devuelve cierto si caracter es una letra mayúscula, y falso en caso contrario.
	toupper(caracter):devuelve la mayúscula asociada a caracter, si la tiene; si no, devuelve el mismo caracter.
	tolower(caracter):devuelve la minúscula asociada a caracter, si la tiene; si no, devuelve el mismo caracter.*/
	for(i=(n-1);i>=0;i--){
		cadInv[j]=cad[i];
		j++;
	}
	printf("cadena al reves: %s\n",cadInv);
	//Unidad6 es el de cadenas
	
	//estructuras
	//carga
	struct Alumno record[4];
	
	record[0].DNI=66666666;
	strcpy(record[0].apellido,"Lwanga");
	strcpy(record[0].nombre,"Bautista");
	//mostrar
	for(i=0;i<5;i++){
		printf("%d\t",record[i].DNI);
		printf("%s\t\t",record[i].apellido);
		printf("%s",record[i].nombre);
		printf("\n");
		cont++;
	}
	return 0;
}

