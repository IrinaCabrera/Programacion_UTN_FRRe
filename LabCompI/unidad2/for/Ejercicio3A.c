#include <stdio.h>

int main() {
	int i,j;
	for(i = 1; i <= 5; i++){
		printf("%d \n",i);
		for(j = i; j >= 1; j-=2){
			printf("%d \n",j);
		}
	}
	return 0;
}

/* LA SALIDA ES: 
I 1
J 1
I 2
J 2
I 3
J 3
J 1
I 4
J 4
J 2
I 5
J 5
J 3
J 1
*/
//Es un for anidado, ingresa primero por el for de i, luego sigue con el for j
//y ese for sigue hasta que se termine de cumplir, para volver a comenzr con el for de i.
