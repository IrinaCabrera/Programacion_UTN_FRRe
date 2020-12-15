#include <stdio.h>

int main() {
	int i, j, k;
	for(i = 3; i > 0; i--){
		for(j = 1; j <= i; j++){
			for(k = i; k >= j; k--){
				printf("%d %d %d \n",
					   i,j,k);
			}
		}
	}
	return 0;
}
/*LA SALIDA ES: 
3 1 3
3 1 2
3 1 1
3 2 3
3 2 2
3 3 3
2 1 2
2 1 1
2 2 2
1 1 1
*/
