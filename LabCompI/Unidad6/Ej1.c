#include <stdio.h>
#include <string.h>

char p;
int i,cont=0,j=0,n;
int main() {
	/*printf("**Esta cadena guarda 10 lugares, llenarlos si o si.**\n"
		   "*ejemplos: aallaallaa, cabalarais*\n\n");*/
	//cargo al cadena
	printf("Ingrese el tamaño de la cadena: ");
	scanf("%d",&n);
	
	char cad[n],cadInv[n];
	
	printf("ingrese el contenido de la cadena: ");
	scanf("%s",cad);
	
	//muestro el contenido
	printf("muestro: %s\n",cad);
	
	//cadena al reves
	//guardo en otra cadena para reusala
	for(i=(n-1);i>=0;i--){
		cadInv[j]=cad[i];
		j++;
	}
	printf("cadena al reves: %s\n",cadInv);
	
	//veces que una vocar aparece en la cadena;
	printf("ingrese una vocal para saber cuantas veces aparece en la cadena ");
	scanf("%c",&p);
	
	for(i=0;i<n;i++){
		if(p==cad[i]){
			cont++;
		}
	}
	printf("la vocal indicada aparece %d vez/ces en la cadena.\n",cont);
	//cuantas veces aparece "ca" seguido
	cont=0;
	for(i=0;i<n;i++){
		if(cad[i]=='c'&&cad[i+1]=='a'){
			cont++;
		}
	}
	printf("'ca' aparece %d vez/ces en la cadena.\n",cont);
	//¿es polindromo?
	j=0;
	cont=0;
	for(i=0;i<n;i++){
		printf("i: %d, j: %d, cont: %d\n",i,j,cont);
		if(cad[i]==cadInv[j]){
			cont++;
		}
		j++;
	}
	if(cont==n){
		printf("la palabra es un poliadromo\n");
	}else{
		printf("la palabra NO es un poliadromo\n");
	}

	return 0;
}

