#include <stdio.h>
#include <string.h>
int i,cont=0;

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
	
	record[1].DNI=77777777;
	strcpy(record[1].apellido,"Champag");
	strcpy(record[1].nombre,"Marcelino");
	
	record[2].DNI=88888888;
	strcpy(record[2].apellido,"Barbar");
	strcpy(record[2].nombre,"Gregorio");
	
	record[3].DNI=99999999;
	strcpy(record[3].apellido,"Cafasso");
	strcpy(record[3].nombre,"Marcelino");
	
	record[4].DNI=10101010;
	strcpy(record[4].apellido,"Beato");
	strcpy(record[4].nombre,"Daminici");
	
	printf("\tListado de Alumnos\n");
	printf("DNI\t\tApellido\tNombre\n");
	printf("----------------------------------------------------\n");
	for(i=0;i<5;i++){
		printf("%d\t",record[i].DNI);
		printf("%s\t\t",record[i].apellido);
		printf("%s",record[i].nombre);
		printf("\n");
		cont++;
	}
	printf("Total de alumnos: %d",cont);
	return 0;
}

