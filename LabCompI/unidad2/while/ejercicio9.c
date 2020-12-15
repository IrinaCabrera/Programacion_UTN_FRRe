#include <stdio.h>

int main() {
	int seleccion, contador=0;
	float cantAgua=0, promedio=0, cantAGUAcaida=0,mayorLLUVIA=0,menorLLUVIA=0,contador2=0;
	
	printf("tipee 1 para meses con 28 días,2 para 29 dias, 3 para 30 dias y 4 para 31 dias...\n");
	scanf("%d",&seleccion);
	switch(seleccion){
		case 1:
			while(contador < 28){
				printf("Ingresa la cantidad de agua caida el dia de hoy en mm: \n");
				scanf("%f",&cantAgua);
				if(contador2 >= 1){
					cantAGUAcaida=cantAGUAcaida+cantAgua;
				}
				else{
					cantAGUAcaida=cantAgua;
				}
				if(cantAgua > mayorLLUVIA){
					mayorLLUVIA = cantAgua;
				}
				else{
					mayorLLUVIA=mayorLLUVIA;
				}
				if(cantAgua > menorLLUVIA){
					if(menorLLUVIA == 0){
						menorLLUVIA = cantAgua;
					}
					else{
						menorLLUVIA=menorLLUVIA;
					}
				}
				else{
					menorLLUVIA=cantAgua;
				}
				promedio = cantAGUAcaida /28;
				contador2++;
				contador++;
			}
			printf("La mayor cantidad de mililitros caídos en un día fueron de: %f\n",mayorLLUVIA);
			printf("La menor cantidad de mililitros caídos en un día fueron de: %f\n",menorLLUVIA);
			printf("En promedio los mililitros caidos al dia fueron de: %f \n",promedio);
			break;
		case 2:
			while(contador < 29){
				printf("Ingresa la cantidad de agua caida el dia de hoy en mm: \n");
				scanf("%f",&cantAgua);
				if(contador2 >= 1){
					cantAGUAcaida=cantAGUAcaida+cantAgua;
				}
				else{
					cantAGUAcaida=cantAgua;
				}
				if(cantAgua > mayorLLUVIA){
					mayorLLUVIA = cantAgua;
				}
				else{
					mayorLLUVIA=mayorLLUVIA;
				}
				if(cantAgua > menorLLUVIA){
					if(menorLLUVIA == 0){
						menorLLUVIA = cantAgua;
					}
					else{
						menorLLUVIA=menorLLUVIA;
					}
				}
				else{
					menorLLUVIA=cantAgua;
				}
				promedio = cantAGUAcaida /29;
				contador2++;
				contador++;
			}
			printf("La mayor cantidad de mililitros caídos en un día fueron de: %f\n",mayorLLUVIA);
			printf("La menor cantidad de mililitros caídos en un día fueron de: %f\n",menorLLUVIA);
			printf("En promedio los mililitros caidos al dia fueron de: %f \n",promedio);
			break;
		case 3:
			while(contador < 30){
				printf("Ingresa la cantidad de agua caida el dia de hoy en mm: \n");
				scanf("%f",&cantAgua);
				if(contador2 >= 1){
					cantAGUAcaida=cantAGUAcaida+cantAgua;
				}
				else{
					cantAGUAcaida=cantAgua;
				}
				if(cantAgua > mayorLLUVIA){
					mayorLLUVIA = cantAgua;
				}
				else{
					mayorLLUVIA=mayorLLUVIA;
				}
				if(cantAgua > menorLLUVIA){
					if(menorLLUVIA == 0){
						menorLLUVIA = cantAgua;
					}
					else{
						menorLLUVIA=menorLLUVIA;
					}
				}
				else{
					menorLLUVIA=cantAgua;
				}
				promedio = cantAGUAcaida /30;
				contador2++;
				contador++;
			}
			printf("La mayor cantidad de mililitros caídos en un día fueron de: %f\n",mayorLLUVIA);
			printf("La menor cantidad de mililitros caídos en un día fueron de: %f\n",menorLLUVIA);
			printf("En promedio los mililitros caidos al dia fueron de: %f \n",promedio);
			break;
		case 4:
			while(contador < 31){
				printf("Ingresa la cantidad de agua caida el dia de hoy en mm: \n");
				scanf("%f",&cantAgua);
				if(contador2 >= 1){
					cantAGUAcaida=cantAGUAcaida+cantAgua;
				}
				else{
					cantAGUAcaida=cantAgua;
				}
				if(cantAgua > mayorLLUVIA){
					mayorLLUVIA = cantAgua;
				}
				else{
					mayorLLUVIA=mayorLLUVIA;
				}
				if(cantAgua > menorLLUVIA){
					if(menorLLUVIA == 0){
						menorLLUVIA = cantAgua;
					}
					else{
						menorLLUVIA=menorLLUVIA;
					}
				}
				else{
					menorLLUVIA=cantAgua;
				}
				promedio = cantAGUAcaida /31;
				contador2++;
				contador++;
			}
			printf("La mayor cantidad de mililitros caídos en un día fueron de: %f\n",mayorLLUVIA);
			printf("La menor cantidad de mililitros caídos en un día fueron de: %f\n",menorLLUVIA);
			printf("En promedio los mililitros caidos al dia fueron de: %f \n",promedio);
			break;
		default:
			printf("desea volver a intentarlo?, solo tiene 4 selecciones posibles.\n"
				   "1 para SI, otro numero para SALIR");
			break;
	}

	return 0;
}

