#include <stdio.h>
#include <stdio.h>
//determino la estructura
struct estructura_amigo {
	char nombre[30];
	char apellido[30];
	char telefono[10];
	int edad;
};
//cargo los valores de mi estructura
struct estructura_amigo amigo = {
	"Juanjo",
		"López",
		"983403367",
		30
};
int main() {
	//**los muestro en pantalla**
	
	//ej: amigo.apellido__ donde amigo es:struct estructura_amigo amigo= {}
	//y apellido es el atributo de: struct estructura_amigo {}
	
	//muestra los datos cargados en la siguiente estructura.
	
	printf("%s tiene ", amigo.apellido);
	printf("%i anios ",amigo.edad);
	printf("y su telefono es el %s.\n",amigo.telefono);

	
	return 0;
}

