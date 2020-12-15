#include <stdio.h>
//creo una estructura para agilizar mi archivo
struct alumno{
	int DNI;
	char Apellido[20];
	char Nombre[20];
	int Nota;
};
int main() {
	//para poder trabajar con el archivo
	FILE *archivo;
	int i;
	int cantA;
	printf("Ingrese la cantidad de alumnos que quiere agregar: ");
	scanf("%d",&cantA);
	
	//creo la cantidad de alumnos que voy a grabar
	struct alumno alumno[cantA];
	
	//abro el archivo binario a modo de escritura
	archivo=fopen("Ej5.txt","r+");
	//por si hay un problema en la apertura o no
	if(archivo ==NULL){
		printf("No se encontró el archivo.");
	}else{
		printf("El archivo se abrió exitosamente.");
	}
	//escribo dentro del archivo
	fputs("Listado de Alumnos\nDNI\tApellido\tNombre\tNota\n----------------------------------------\n",archivo);
	fclose(archivo);
	
	//cargo el struct
	for(i=0;i<cantA;i++){
		printf("\n");
		printf("Ingrese el DNI del %d° Alumno: ",i+1);
		scanf("%d",&alumno[i].DNI);
		
		printf("Ingrese el apellido del %d° Alumno: ",i+1);
		scanf("%s",alumno[i].Apellido);
		
		printf("Ingrese el nombre del %d° Alumno: ",i+1);
		scanf("%s",alumno[i].Nombre);
		
		printf("Ingrese la nota del %d° Alumno: ",i+1);
		scanf("%d",&alumno[i].Nota);
	}
	/*archivo = fopen("Ej5.txt","a+t");
	for(i=0;i<cantA;i++){
		fwrite(&alumno,sizeof(alumno),1,archivo);
		
	}*/
	//Total de alumnos
	archivo = fopen("Ej5.txt","a+t");
	if(archivo){
		fwrite(alumno,sizeof(struct alumno),cantA,archivo);
		fclose(archivo);
	}
	return 0;
}

