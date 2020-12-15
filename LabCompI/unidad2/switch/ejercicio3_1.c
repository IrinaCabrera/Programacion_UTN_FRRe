#include <stdio.h>

int main() {
	int seleccion=0;
	printf("******************************\n"
		   "....::Sistema de pedidos::....\n"
		   "1 - Bebidas\n"
		   "2 - Comidas\n"
		   "3 - Postres\n"
		   "4 - Salir\n"
		   "..............................\n"
		   "Elija una opcion...\n"
		   "******************************\n");
	scanf("%d",&seleccion);
	switch(seleccion){
	case 1:
		printf("Seleccionaste la opción 1 - Bebidas");
		break;
	case 2:
		printf("Seleccionaste la opción 2 - Comidas");
		break;
	case 3:
		printf("Seleccionaste la opción 3 - Postres");
		break;
	case 4:
		printf("Seleccionaste la opción 4 - Salir");
		break;
	default:
		seleccion=0;
		printf("Error");
		break;
	}
	return 0;
}

