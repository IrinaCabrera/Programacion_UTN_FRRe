#include <stdio.h>
#include <string.h>

struct amigo
{
	int id;
	char nombre[20];
	char dir[20];
};

int main()
{
	struct amigo record ; //declarar la estructura
	
	// asignar datos  a cada elemento de la estructura
	record.id=1;
	strcpy(record.nombre, "Raju");
	strcpy(record.dir, "catamarca 30");
	
	
	// mostrar por pantalla los datos de la estructura
	
	printf(" Id es: %d \n", record.id);
	printf(" Name es: %s \n", record.nombre);
	printf(" Dirección es: %s \n", record.dir);
	return 0;
}
