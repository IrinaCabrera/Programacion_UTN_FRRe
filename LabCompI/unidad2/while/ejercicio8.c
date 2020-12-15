#include <stdio.h>
#include <math.h>

int main() {
	int legajo, sexo,sumsexo=0, totsuel=0, contador=0, sueldo,mayorM=0,mayorF=0,menorM=0,menorF=0,contador1=0,contador2=0;
	while(contador < 10){
		printf("ingrese el numero de legajo del empleado: \n");
		scanf("%d",&legajo);
		printf("ingrese el sexo del empleado/a (1 para F y 2 para M): \n");
		scanf("%d",&sexo);
		printf("ingrese el sueldo mensual del empleado/a: $ \n");
		scanf("%d",&sueldo);
		totsuel= totsuel + sueldo;
		sumsexo++;
		if(sexo==2){
			if(sueldo > mayorM){
				mayorM=sueldo;
			}
			else{
				mayorM=mayorM;
			}
			if(sueldo > menorM){
				menorM=menorM;
				while(menorM==0){
					menorM=sueldo;
				}
			}
			else{
				menorM=sueldo;
			}
			if(sueldo > 500){
				contador1++;
			}
		}
		else{
			if(sueldo > mayorF){
				mayorF=sueldo;
			}
			else{
				mayorF=mayorF;
			}
			if(sueldo > menorF){
				menorF=menorF;
				while(menorF==0){
					menorF=sueldo;
				}
			}
			else{
				menorF=sueldo;
			}
			if(sueldo > 500){
				contador2++;
			}
		}
		contador++;
	}
	printf("Total de hombres y mujeres: %d\n",sumsexo);
	printf("Total de los sueldos es: %d\n",totsuel);
	printf("El sueldo mayor en hombres es de: $ %d y en mujeres es de: $ %d\n",mayorM,mayorF);
	printf("El sueldo menor en hombres es de: $ %d y en mujeres es de: $ %d\n",menorM,menorF);
	printf("%d empleado/s ganan mas de $500\n",contador1);
	printf("%d empleada/s ganan mas de $500\n",contador2);
	return 0;
}
