//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_2
{

	public static void main(String[] args)
	{

Scanner leia = new Scanner(System.in);

	int numero,par=0,impar=0;
	
	for(int x=1;x<=10;x++)
	{
		System.out.println("\nEntre com o valor do "+x+"º número:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0)
		{
			par++;
		}
		else
		{
			impar++;
		}
	}
			System.out.println("\nVocê entrou com "+par+" números pares.");
			System.out.println("\nVocê entrou com "+impar+" números ímpares.");
	}
}