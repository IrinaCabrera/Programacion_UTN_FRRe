#include <stdio.h>

int main() {
	int codigo;
	printf("ingrese el codigo de la asignatura para saber el nombre de la asignatura\n");
	printf("codigos: 132, 402, 111, 171, 120\n");
	scanf("%d",&codigo);
	switch(codigo){
	case 132:
		printf("La asignatura es: Tecnicas de organizacion empresarial\n");
		break;
	case 402:
		printf("La asignatura es: Matematica discreta");
		break;
	case 111:
		printf("La asignatura es: Elementos de programacion");
		break;
	case 171:
		printf("La asignatura es: Fisica");
		break;
	case 120:
		printf("La asignatura es: Sistemas electronicos digitales");
		break;
	default:
		printf("Ingreso no valido, intente mas tarde...");
		break;
	return 0;
	}
}
