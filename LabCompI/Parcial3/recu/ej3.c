#include <stdio.h>
#include <string.h>
#define d 100
//EJERCICIO DE CADENAS
int vocal(char texto){
	switch(texto){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		return 1;
		break;
	default:
		break;
	}
	return 0;
}
int main() {
	int llamadoVOCAL,cont=0;
	char texto[d]={"Hoy es lunes. Hoy es el parcial de Laboratorio. Estudio programación."};
	
	//muestro el tamaño de la cadena con la función predefinida
	printf("el tamaño de la cadena es: %d",strlen(texto));
	
	//coincide la dimensión de la cadena???
	if(d==strlen(texto)){
		printf("\nLa dimensión de la cadena coincide.");
	}else{
		printf("\nLa dimensión de la cadena NO coincide.");
	}
	
	printf("\n");
	//muestro la cadena una debajo de la otra
	for(int i=0;i<strlen(texto);i++){
		if(texto[i]=='.'){
			printf("%c\n",texto[i]);
		}else{
			printf("%c",texto[i]);
		}
	}
	
	for(int i=0;i<=strlen(texto);i++){
		llamadoVOCAL=vocal(texto[i]);
		if(llamadoVOCAL==1){
			cont++;
		}
	}
	printf("El texto tiene %d vocal/es. ",cont);
	return 0;
}

