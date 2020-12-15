#include <stdio.h>

//v de venta, f de factura
int v, f, articulo, cantLitroUNO=0, cantLitroDOS=0, artUNO=0, artDOS=0, sumLitroUNO = 0, factura = 0;
float precioLitroUNO, precioLitroDOS, totalFacturado=0, totalUNO, totalDOS;

int main() {
	
	printf("cuantas ventas tuvo?: ");
	scanf("%d", &v);
	printf("___________________________\n");
	
	/*El ingreso de datos finaliza con un número de factura igual a cero*/
	
	for(f = v - 1; f >= 0; f = f-1){
		
		printf("\nN° de factura: %d\n", f);
		printf("N° de articulo (1 O 2): ");
		scanf("%d", &articulo);
		
		switch(articulo){
		case 1:
			
			printf("Cantidad (L): ");
			scanf("%d", &cantLitroUNO);
			printf("Precio por litro: $");
			scanf("%f", &precioLitroUNO);
			
			sumLitroUNO = sumLitroUNO + cantLitroUNO;
			totalUNO = cantLitroUNO * precioLitroUNO;
			
			if(totalUNO > 300){
				factura++;
			}
			
			totalFacturado = totalFacturado + totalUNO;
			artUNO++;
			
			break;
		case 2:
			
			printf("Cantidad (L): ");
			scanf("%d", &cantLitroDOS);
			printf("Precio por litro: $");
			scanf("%f", &precioLitroDOS);
			
			totalDOS = cantLitroDOS * precioLitroDOS;
			
			if(totalDOS > 300){
				factura++;
			}
			
			totalFacturado = totalFacturado +totalDOS;
			artDOS++;
			
			break;
		default:
			
			printf("\nArticulo no encontrado...");
			break;
		}
		printf("___________________________\n");
		
	}
	
	printf("\nTotal FacturadO: $%0.2f", totalFacturado);
	printf("\nCantidad de Litros vendidos del articulo 1: %d", sumLitroUNO);
	printf("\nCantidad de factura/s con mas de $300: %d", factura);
	
	return 0;
}

