#include <stdio.h>

int main () {

    int x,y,toplam,carpim;  

    printf("L�tfen ilk say�n�z� giriniz:"); 
    scanf("%d", &x);

	printf("L�tfen ikinci say�n�z� giriniz:"); 
    scanf("%d", &y);

	toplam=x+y;	
	carpim=x*y;

	printf("Verdi�iniz say�lar�n toplam� %d'dir.\n", toplam);
	printf("Verdi�iniz say�lar�n �arp�m� %d'dir.\n", carpim);

    return 0;
}
