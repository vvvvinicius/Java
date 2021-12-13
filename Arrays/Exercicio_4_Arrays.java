/*
Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
 */

package Arrays;

import java.util.Scanner;

public class Exercicio_4_Arrays
{

	public static void main(String[] args)
	{

		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int [2][2];
		int[][] matriz1 = new int [2][2];
		int[][] matriz2 = new int [2][2];
		int linha,coluna = 0,opcao,soma,subtrair;
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\nInsira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna]=leia.nextInt();
			}
		}
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\nInsira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz1[linha][coluna]=leia.nextInt();
			}
		}
		System.out.println("\nObrigado por informar os valores! Podemos usar ele para alguma das op��es abaixo...");
		System.out.println("\n1 - Somar as duas matrizes.");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda.");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
		System.out.println("\n4 - Imprimir as matrizes.");
		System.out.println("\nQual op��o deseja?");
		opcao=leia.nextInt();
		
		if(opcao == 1)
		{
			System.out.printf("\nVoc� escolheu a op��o de somar as duas matrizes, o resultado �: ");
				for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				
				for(coluna = 0; coluna < 2; coluna ++)
				{
					matriz2[linha][coluna] = matriz[linha][coluna] + matriz1[linha][coluna];
					System.out.printf("\t %d \t",matriz2[linha][coluna]);
				}
			}
		}
		else if(opcao == 2)
		{
			System.out.printf("\nVoc� escolheu a op��o de subtrair a primeira matriz da segunda, o resultado �: ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				
				for(coluna = 0; coluna < 2; coluna ++)
				{
					matriz2[linha][coluna] = matriz1[linha][coluna] - matriz[linha][coluna];
					System.out.printf("\t %d \t",matriz2[linha][coluna]);
				}
			}
		}
		else if(opcao == 3)
		{
			System.out.printf("\nVoc� escolheu a op��o de adicionar uma constante as duas matrizes, a primeira �: ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					if(linha == coluna)
					{
						System.out.printf("\t %d \t",matriz[linha][coluna]);
					}
				}
			}
			System.out.printf("\nVoc� escolheu a op��o de adicionar uma constante as duas matrizes, a segunda �: ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					if(linha == coluna)
					{
						System.out.printf("\t %d \t",matriz1[linha][coluna]);
					}
				}
			}
		}
		else if(opcao == 4)
		{
			System.out.printf("\n\nVoc� escolheu a op��o para imprimir as matrizes, a primeira �: ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",matriz[linha][coluna]);
				}
			}
			System.out.printf("\n\nE a segunda �:");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",matriz1[linha][coluna]);
				}
			}
		}
			else
				{
					System.out.println("\n\nVoc� escolheu uma op��o inv�lida. Reinicie o programa e use uma op��o v�lida!");
				}
		
					System.out.println("\n\n\t\tFim do programa! :)");

	}
}

