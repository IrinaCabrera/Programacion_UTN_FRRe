#include <stdio.h>
#include <math.h>
#include <conio.h>
#include <time.h>
#include <stdlib.h>
//variables
int player1, player2,condicion,eleccion1, determinante;

//Tuve que armar una funcion para no repetir codigo
int ppt (int player1, int player2){
	
	//Estructura para comparar entre los valores de piedra, papel y tijera para saber quien gana la ronda.
	if(player1 != player2){
		
		if((player1 == 1 && player2 == 2)||(player2 == 1 && player1== 2)){
			
			if(player1 == 2 && player2 == 1){
				printf("\nGANA PLAYER 1 CON PAPEL");
			}
			else{
				printf("\nGANA PLAYER 2 CON PAPEL");
			}
		}
		else if((player1 == 1 && player2 == 3)||(player2 == 1 && player1== 3)){
			
			if(player1 == 1 && player2 == 3){
				printf("\nGANA PLAYER 1 CON PIEDRA");
			}
			else{
				printf("\nGANA PLAYER 2 CON PIEDRA");
			}
		}
		else{
			
			if(player1 == 3 && player2 == 2){
				printf("\nGANA PLAYER 1 CON TIJERAS");
			}
			else{
				printf("\nGANA PLAYER 2 CON Tijeras");
			}
		}
	}
	else{
		
		if((player1 > 3 ||  player2 > 3)){
			printf("Valores erroneos ingresados");
		}
		else{
			printf("\nEMPATE");
		}
	}
}
int main (){
	
	srand(time(NULL));
	
	//Mi condicion para saber si continuar otro juego mas o salir.
	condicion = 1;
	
	while(condicion == 1){
		
		printf("\nElija una opción: \n|1.PLAYER 1 VS. PLAYER 2|\n"
			   "|2.PLAYER 1 VS. CPU (PLAYER 2)|\n|3.CPU(PLAYER 1) VS CPU(PLAYER 2)|\n ");
		scanf("%d",&eleccion1);
		
		//Mis distintos modos de juego estan en este switch.
		switch(eleccion1){
			case 1:
				
				printf("\nbienvenido al juego: PIEDRA, PAPEL Y TIJERA \n"
					   "Elija una opción (player 1): \n"
					   "1 para PIEDRA \n2 para PAPEL \n3 para TIJERA.");
				scanf("%d",&player1);
				printf("Elija una opción (player 2): \n"
					   "1 para PIEDRA \n2 para papel \n3 para tijeras.");
				scanf("%d",&player2);
				
				determinante = ppt(player1,player2); //determinante porque sin esta variable nada funcionaria.
				
				break;
				
			case 2:
				
				printf("\nbienvenido al juego: PIEDRA, PAPEL Y TIJERA \n"
					   "Elija una opción (player 1): \n"
					   "1 para PIEDRA \n2 para PAPEL \n3 para TIJERA.");
				scanf("%d",&player1);
				
				player2 = 1+rand()%(4-1);
				
				printf("\nla cpu dice que: %d",player2);
				
				determinante = ppt(player1,player2);
				break;
				
			case 3:
				//Iinicialmente decia eso que esta aqui abajo, no quise borrarlo porque me encariñe con el codigo asi que lo deje asi, iba a ir un dibujo de frankenstein pero no encontre uno indicado.
				//Se que no es profesional o acoerde a la situacion pero le da un toque de autenticidad.
				
				printf("..............................¡¡HAZ TU APUESTA!!..............................\n"
					   /*"Es aqui cuando la computadora es más inteligente que nosotros, como siempre...\n"*/
					   "Es aqui cuando nos convertimos en espectadores de la diversion de alguien/algo mas "/*, como siempre...*/ "\n"
					   /*"A PESAR DE QUE SERIA ALGO Y NO ALGUIEN, e inteligencia no sea, prosperara mas que un individuo...\n"*/
					   "....................IT'S ALIVE, IT'S ALIVE, IT'S ALIVEEEEE....................\n");
				
				printf("\n1 para PIEDRA \n2 para PAPEL \n3 para TIJERA.\n");
				player1 = 1+rand()%(4-1);
				player2 = 1+rand()%(4-1);
					
				printf("\nPlayer 1 ha optado por la elección: %d", player1);
				printf("\nPlayer 2 ha optado por la elección: %d", player2);
					
				determinante = ppt(player1,player2);
					
				break;
				
			default:
				
				printf("\nSolo puedes optar entre las opciones 1, 2 y 3. Intenta de nuevo ");
				break;
		}
		//pregunta para continuar o salir.
		printf("\nDesea continuar? 1 para si ; Cualquier otro numero para Salir ");
		scanf("%d",&condicion);
	}
	//Salida.
	printf("\nAdiós :DD");
	getch();
	
	return 0;

}
