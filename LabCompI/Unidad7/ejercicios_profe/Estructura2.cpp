#include <stdio.h>
#include <string.h>

struct agenda
{
	int id;
	char nombre[20];
	char dir[20];
};

int main()
{
	int i;
	
	struct agenda record[2]; //declarar la estructura
	
	// asignar datos  a cada elemento de la estructura
	record[0].id=1;
	strcpy(record[0].nombre, "Raju");
	strcpy(record[0].dir, "catamarca 30");
	
	record[1].id=1;
	strcpy(record[1].nombre, "Pepito");
	strcpy(record[1].dir, "Paz 350");
	
	record[2].id=1;
	strcpy(record[2].nombre, "Silvia");
	strcpy(record[2].dir, "cordoba 130");
	
	for(i=0; i<3; i++)
	{
		printf("    Registro de Estudiantes : %d \n", i+1);
		printf(" Id es: %d \n", record[i].id);
		printf(" Nombre es: %s \n", record[i].nombre);
		printf(" Dirección  es: %s \n", record[i].dir);
	}
	return 0;
}
