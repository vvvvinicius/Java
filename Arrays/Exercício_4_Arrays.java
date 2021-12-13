/*
Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
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
		System.out.println("\nObrigado por informar os valores! Podemos usar ele para alguma das opções abaixo...");
		System.out.println("\n1 - Somar as duas matrizes.");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda.");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
		System.out.println("\n4 - Imprimir as matrizes.");
		System.out.println("\nQual opção deseja?");
		opcao=leia.nextInt();
		
		if(opcao == 1)
		{
			System.out.printf("\nVocê escolheu a opção de somar as duas matrizes, o resultado é: ");
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
			System.out.printf("\nVocê escolheu a opção de subtrair a primeira matriz da segunda, o resultado é: ");
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
			System.out.printf("\nVocê escolheu a opção de adicionar uma constante as duas matrizes, a primeira é: ");
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
			System.out.printf("\nVocê escolheu a opção de adicionar uma constante as duas matrizes, a segunda é: ");
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
			System.out.printf("\n\nVocê escolheu a opção para imprimir as matrizes, a primeira é: ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",matriz[linha][coluna]);
				}
			}
			System.out.printf("\n\nE a segunda é:");
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
					System.out.println("\n\nVocê escolheu uma opção inválida. Reinicie o programa e use uma opção válida!");
				}
		
					System.out.println("\n\n\t\tFim do programa! :)");

	}
}

