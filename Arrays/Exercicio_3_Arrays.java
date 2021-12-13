/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package Arrays;

import java.util.Scanner;

public class Exercicio_3_Arrays
{

	public static void main(String[] args)
	{

		Scanner leia = new Scanner(System.in);
		
		int numero[][] = new int[3][3];
		int linha, coluna, maiorDez=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
			
				if(numero[linha][coluna] > 10)
				{
					maiorDez++;
				}
			}
		}
				System.out.println("\nVocê inseriu "+maiorDez+" número(s) maior(es) que 10.");
	}

}
