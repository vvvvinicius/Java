/*
 Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
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
				//recebendo os n�meros
				System.out.println("\nEntre com o "+(x+1)+"� n�mero inteiro: ");
				numero[x] = leia.nextInt();
			}
				for(x=0;x<6;x++)
				{
					//se for par
					if(numero[x]%2==0)
					{
						somaPar = somaPar + numero[x];
					}
					//se for �mpar
					else
					{
						quantidadeImpar++;
					}
				}
		
				System.out.println("\nA soma dos n�meros pares �: "+somaPar);
	
				System.out.println("\nA quantidade de n�meros �mpares digitados foi: "+quantidadeImpar);
				
				System.out.println("\nOs numeros �mpares digitados foram: ");
				for(x=0;x<6;x++)
				{
					if(numero[x]%2!=0)
					{
						System.out.println("\n"+numero[x]);
					}
				}
				System.out.println("\nOs n�meros pares que foram digitados s�o:");
				for(x=0;x<6;x++)
				{
					if(numero[x]%2==0)
					{
						System.out.println("\n"+numero[x]);
					}
				}
		

	}
}