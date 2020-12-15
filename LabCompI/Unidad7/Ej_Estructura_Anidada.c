#include <stdio.h>
//determino mi estructura
struct notebook{
	char color[10];
	char marca[10];
	char numSerie[20];
	char modelo[10];
	struct hardware{
		char procesador[20];
		int ram;
		int memoriaGB;
		struct software{
			char sistemaOperativo[15];
		};
	};
};
//cargo sus valores
struct notebook n={
	"negro",
		"samsung",
		"GT118H4UR300158E",
		"180T"
};
struct hardware h={
	"Intel Core i3",
		4,
		500
};
struct software s={
	"windows 7"
};
int main() {
	//muestro por pantalla
	printf("*Mi notebook es de color %s, es de la marca %s.\n",n.color,n.marca);
	printf("*Contiene %d de memoria RAM, una capacidad de almacenamiento de %d GB y tambien un procesador %s.\n",h.ram,h.memoriaGB,h.procesador);
	printf("*El sistema operativo %s que contiene es muy amigable.\n",s.sistemaOperativo);
	printf("*Mi notebook es perfecta para trabajar las herramientas office.");
	return 0;
}

