/*
 Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

package Arrays;

import java.util.Scanner;

public class Exercicio_2_Arrays
{
	public static void main(String[] args)
	{
		
		int x, somaPar=0,quantidadeImpar=0, numero[] = new int[6];
		Scanner leia = new Scanner(System.in);
		
			for(x=0;x<6;x++)
			{
				//recebendo os números
				System.out.println("\nEntre com o "+(x+1)+"º número inteiro: ");
				numero[x] = leia.nextInt();
			}
				for(x=0;x<6;x++)
				{
					//se for par
					if(numero[x]%2==0)
					{
						somaPar = somaPar + numero[x];
					}
					//se for ímpar
					else
					{
						quantidadeImpar++;
					}
				}
		
				System.out.println("\nA soma dos números pares é: "+somaPar);
	
				System.out.println("\nA quantidade de números ímpares digitados foi: "+quantidadeImpar);
				
				System.out.println("\nOs numeros ímpares digitados foram: ");
				for(x=0;x<6;x++)
				{
					if(numero[x]%2!=0)
					{
						System.out.println("\n"+numero[x]);
					}
				}
				System.out.println("\nOs números pares que foram digitados são:");
				for(x=0;x<6;x++)
				{
					if(numero[x]%2==0)
					{
						System.out.println("\n"+numero[x]);
					}
				}
		

	}
}