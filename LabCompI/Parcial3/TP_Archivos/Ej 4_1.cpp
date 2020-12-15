#include <stdio.h>

int main() {
	FILE *archivo;
	char input;
	char lectura;
	
	//spertura de ejemplo
	archivo=fopen("programa.txt","r+b");
	
	if(archivo ==NULL){
		printf("No se encontró el archivo.");
	}else{
		printf("El archivo se abrió exitosamente.");
	}
	//modo escritura
	archivo=fopen("programa.txt","a+t");
	printf("\nIntroduce un texto al archivo: ");
	
	while((input = getchar()) != '\n'){
		printf("%c",fputc(input,archivo));
	}
	if((fclose(archivo))==-1){
		printf("\nNo se pudo cerrar el archivo.");
	}else{
		printf("\nEl archivo se ha cerrado exitosamente.");
	}
	//modo lectura
	printf("\n");
	archivo = fopen("programa.txt","r");
	printf("muestro:\n");
	while((lectura = fgetc(archivo))  != EOF){
		
		if(lectura == '.'){
			printf("\n");
		}else{
			printf("%c",lectura);
		}
		
	}
	//cierra el archivo
	if((fclose(archivo))==-1){
		printf("\nNo se pudo cerrar el archivo.");
	}else{
		printf("\nEl archivo se ha cerrado exitosamente.");
	}
	return 0;
}

