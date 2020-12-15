#include <stdio.h>
#include <string.h>
#define n 1000
char cad[n],parrafo[n],oracion[n],aux[n];
int i,j,p=0,o=0,op=0,op1=0,lnumPa=0;
int inicio,fin,v,c,ino,fio,k,l=0,numPa=0;
char ini='f',fi='f';
int main() {
	printf("ingrese un texto.\n");
	printf("Separe cada parrafos con un asterisco al inicio y al final.\n");
	printf("Finalice las oraciones con un punto.\n");
	gets(cad);
	c=strlen(cad);
	int m=0;
	printf("Parrafos:\n\n");
	for(i=0;i<c;i++){
		//identifica los asteriscos para separar cada parrafo
		if(cad[i]=='*'|| i==0){
			//marca el principio y el final de cada parrafo
			if(ini=='f'){
				inicio=i;
				ini='v';
			}else{
				fin=i;
				fi='v';
			}
		}
		if(ini == 'v' && fi=='v'){
			//creador del parrago, se guarda en una cadena
			for(j=inicio;j<fin;j++){
				parrafo[m]=cad[j];
				m++;
			}
			//cuantos caracteres ocupa el parrafo en la cadena.
			v=strlen(parrafo);
			//contador del numero especifico de cada parrafo
			numPa++;
			//inicializo el contador
			op=0;
			//recorre cada parrafo contando los puntos del final de cada oracion
			for(j=0;j<v;j++){
				if(parrafo[j]=='.'){
					//contador de oraciones
					o++;
					//contador de oraciones por parrafo
					op++;
					//primera oracion de cada párrafo
					if(op==1){
						fio=j;
						for(k=0;k<fio;k++){
							oracion[l]=parrafo[k];
							l++;
						}
					}
				}
			}
			printf("El parrafo tiene %d oracion/es\n",op);
			printf("la primera oración del parrafo n° %d es: %s\n",numPa,oracion);
			printf("parrafo: %s\n",parrafo);
			printf("_________________________________________________________________________________\n");
			//contador de parrafos
			p++;
			//parrafo que tenga mas oraciones:
			if(op>op1){
				op1=op;
				lnumPa=numPa;
				//guarda el parrafo en esta cadena auxiliar
				m=0;
				for(j=0;j<=v;j++){
					aux[m]=parrafo[j];
					m++;
				}
			}
			fi='f',m=0,l=0,inicio=fin+1;
			memset(parrafo, 0, n);//vacia el contenido de esta cadena
			memset(oracion, 0, n);//vacia el contenido de esta cadena
		}
	}
	//total oraciones
	printf("Total de oraciones: %d\n",o);
	//total de parrafos:
	printf("Total de parrafos: %d\n\n",p);
	//el parrafo que tiene mas oraciones es:
	printf("El parrafo que tiene mas oraciones es: El parrafo n° %d con %d oraciones el cual es:\n\n",lnumPa,op1);
	//muestra una oracion debajo de otra, oracion que corresponde al parrafo en cuestion
	inicio=0,fin=0;
	for(j=0;j<v;j++){
		if(j==0){
			inicio=j;
			ini='v';
		}
		if(aux[j]=='.'){
			fin=j+1;
			fi='v';
		}
		if(ini=='v' && fi=='v'){
			//cargo el arreglo
			for(i=inicio;i<fin;i++){
				oracion[m]=aux[i];
				m++;
			}
			//muestro la oracion
			printf("%s\n",oracion);
		}
		inicio=fin;
		memset(oracion, 0, v);
		m=0,fi='f';
	}
	return 0;
}

