//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

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
		System.out.println("\nEntre com o valor do "+x+"� n�mero:");
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
			System.out.println("\nVoc� entrou com "+par+" n�meros pares.");
			System.out.println("\nVoc� entrou com "+impar+" n�meros �mpares.");
	}
}