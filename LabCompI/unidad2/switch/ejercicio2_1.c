#include <stdio.h>
#include <conio.h>

int main() {
	int num;
	printf("Ingresa un número correspondiente a un mes del año para saber que mes es: \n");
	scanf("%d",&num);
	switch(num){ 
	case 1:
		printf("Es ENERO\n");
		break;
	case 2:
		printf("Es FEBRERO");
		break;
	case 3:
		printf("Es MARZO\n");
		break;
	case 4:
		printf("Es ABRIL\n");
		break;
	case 5:
		printf("Es MAYO\n");
		break;
	case 6:
		printf("Es JUNIO\n");
		break;
	case 7:
		printf("Es JULIO\n");
		break;
	case 8:
		printf("Es AGOSTO\n");
		break;
	case 9:
		printf("Es SEPTIEMBRE\n");
		break;
	case 10:
		printf("Es OCTUBRE\n");
		break;
	case 11:
		printf("Es NOVIEMBRE\n");
		break;
	case 12:
		printf("Es DICIEMBRE\n");
		break;
	default:
		printf("Ingreso no valido, vuelva a intentarlo mas tarde...\n");
		break;
	}
	getch();
	return 0;
}

