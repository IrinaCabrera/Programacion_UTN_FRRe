#include <stdio.h>

int main() {
	//variables.
	int cantAlumnos, alumRep;
	float porcentaje;
	
	//ingreso de datos.
	printf("Ingrese la cantidad total de alumnos: ");
	scanf("%d", &cantAlumnos);
	printf("Ingrese la cantidad de alumnos reprobados: ");
	scanf("%d", &alumRep);
	
	//calculo.
	porcentaje = (alumRep * 100)/cantAlumnos;
	
	//salida.
	printf("El porcentaje de reprobacion es del: %0.2f por ciento", porcentaje);
	return 0;
}

