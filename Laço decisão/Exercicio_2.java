//Faça um programa que entre com três números e coloque em ordem crescente.

package LacoDecisao;

import java.util.Scanner;

public class Exercicio_2
{

	public static void main(String[] args)
	{
		int n1,n2,n3;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = leia.nextInt();
		
		if( n1 < n2)
		{
			if(n2 < n3)
					{
						System.out.println("\nOs números em ordem crescente é: "+n1+", "+n2+" e "+n3);
					}
			else if(n1 < n3)
					{
						System.out.println("\nOs números em ordem crescente é: "+n1+", "+n3+" e "+n2);
					}
			else
					{
						System.out.println("\nOs números em ordem crescente é: "+n3+", "+n1+" e "+n2);
					}
		}
			else if(n2 < n3)
			{
			if(n1 < n3)
					{
						System.out.println("\nOs números em ordem crescente é: "+n2+", "+n1+" e "+n3);
					}
			else
						System.out.println("\nOs números em ordem crescente é: "+n2+", "+n3+" e "+n1);
			}
			else
					{
						System.out.println("\nOs números em ordem crescente é: "+n3+", "+n2+" e "+n1);
					}
			
	}

}
