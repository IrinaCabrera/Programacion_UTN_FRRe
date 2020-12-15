#include <stdio.h>
#include <string.h>
int i,cont=0,suma=0,mayor,menor;
float prom;

struct Alumno{
	int DNI;
	char apellido[20];
	char nombre[20];
	int edad;
	double promedio;
};
//

int main(){
	struct Alumno record[4];
	
	record[0].DNI=66666666;
	strcpy(record[0].apellido,"Lwanga");
	strcpy(record[0].nombre,"Bautista");
	record[0].edad=27;
	
	record[1].DNI=77777777;
	strcpy(record[1].apellido,"Champag");
	strcpy(record[1].nombre,"Marcelino");
	record[1].edad=6;
	
	record[2].DNI=88888888;
	strcpy(record[2].apellido,"Barbar");
	strcpy(record[2].nombre,"Gregorio");
	record[2].edad=24;
	
	record[3].DNI=99999999;
	strcpy(record[3].apellido,"Cafasso");
	strcpy(record[3].nombre,"Marcelino");
	record[3].edad=20;
	
	record[4].DNI=10101010;
	strcpy(record[4].apellido,"Beato");
	strcpy(record[4].nombre,"Daminici");
	record[4].edad=50;
	
	printf("\tListado de Alumnos\n");
	printf("DNI\t\tApellido\tNombre\t\tEdad\n");
	printf("----------------------------------------------------------\n");
	for(i=0;i<5;i++){
		printf("%d\t",record[i].DNI);
		printf("%s\t\t",record[i].apellido);
		printf("%s\t",record[i].nombre);
		printf("%d",record[i].edad);
		printf("\n");
		cont++;
	}
	for(i=0;i<5;i++){
		suma=suma + record[i].edad;
	}
	for(i=0;i<5;i++){
		if(i==0){
			mayor=record[i].edad;
			menor=record[i].edad;
		}
		if(i>0){
			if(mayor < record[i].edad){
				mayor=record[i].edad;
			}
			if(menor > record[i].edad){
				menor=record[i].edad;
			}
		}
	}
	prom=suma/cont;
	printf("Total de alumnos: %d\n",cont);
	printf("Promedio de edad de alumnos: %.2f\n",prom);
	printf("Mayor Edad: %d\n",mayor);
	printf("Menor Edad: %d\n",menor);
	return 0;
}
	
	
	
