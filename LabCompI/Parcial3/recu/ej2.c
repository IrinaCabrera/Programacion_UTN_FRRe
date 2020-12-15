#include <stdio.h>
//#define n 2
//EJERCICIO DE ALUMNOS CON ARREGLOS
int main() {
	struct alumno{
		int dni;
		char apellido[20];
		char nombre[20];
		int nota;
		
	};
	int i,arreglo[n],cont=0,cont1=0,cont2=0,suma=0,cont3=0;
	int promedio,llamadoPROM,mayor=0,menor=0;
	
	int prom(int arreglo[]){
		for(int i=0;i<n;i++){
			if(arreglo[i]>=7 && arreglo[i]<=10){
				suma=suma + arreglo[i];
				cont3++;
			}
		}
		promedio=suma/cont3;
		return promedio;
	}
		
		struct alumno record[n];
		for(i=0;i<n;i++){
			printf("ingrese el dni del %d alumno: ",i+1);
			scanf("%d",&record[i].dni);
			printf("ingrese el apellido del %d alumno: ",i+1);
			scanf("%s",record[i].apellido);
			printf("ingrese el nombre del %d alumno: ",i+1);
			scanf("%s",record[i].nombre);
			printf("ingrese la nota del %d alumno: ",i+1);
			scanf("%d",&record[i].nota);
		}
		printf("\nNotas de Alumnos del primer parcial\nDNI\tApellido\tNombre\t\tNota\n----------------------------------------------------");
		for(i=0;i<n;i++){
			printf("\n");
			printf("%d\t",record[i].dni);
			printf("%s\t",record[i].apellido);
			printf("%s\t",record[i].nombre);
			printf("%d\t",record[i].nota);
		}
		printf("\nTotal de alumnos: %d\n",n);
		//cargo notas en el arreglo
		for(i=0;i<n;i++){
			arreglo[i]=record[i].nota;
		}
		for(i=0;i<n;i++){
			if(arreglo[i]>=7 && arreglo[i]<=10){
				cont++;
			}else if(arreglo[i]==6){
				cont1++;
			}else{
				cont2++;
			}
		}
		printf("%d Alumno/s promocionaron el parcial.\n",cont);
		printf("%d Alumno/s regularizacon  el parcial.\n",cont1);
		printf("%d Alumno/s desaprobaron el parcial.\n",cont2);
		
		llamadoPROM=prom(arreglo);
		printf("\nEl promedio es: %d",llamadoPROM);
		
		//mayor y menor
		for(i=0;i<n;i++){
			if(i==0){
				mayor=arreglo[i];
				menor=arreglo[i];
			}else{
				if(arreglo[i]<menor){
					menor=arreglo[i];
				}
				if(arreglo[i]>mayor){
					mayor=arreglo[i];
				}
			}
		}
		
		printf("la nota mayor es: %d y la nota menor es: %d",mayor,menor);
		/*char arreglo[]={'a','c','v','d','x'};
		char p;
		printf("ingrese una letra: ");
		scanf("%c",&p);
		
		for(int i=0;i<sizeof(arreglo);i++){
		if(p==arreglo[i]){
		printf("\nEl char se ha encontrado.");
		}else{
		printf("\nEl char no se ha encontrado.");
		}
		}*/
		
		
		return 0;
}


