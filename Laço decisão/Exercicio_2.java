//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package LacoDecisao;

import java.util.Scanner;

public class Exercicio_2
{

	public static void main(String[] args)
	{
		int n1,n2,n3;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if( n1 < n2)
		{
			if(n2 < n3)
					{
						System.out.println("\nOs n�meros em ordem crescente �: "+n1+", "+n2+" e "+n3);
					}
			else if(n1 < n3)
					{
						System.out.println("\nOs n�meros em ordem crescente �: "+n1+", "+n3+" e "+n2);
					}
			else
					{
						System.out.println("\nOs n�meros em ordem crescente �: "+n3+", "+n1+" e "+n2);
					}
		}
			else if(n2 < n3)
			{
			if(n1 < n3)
					{
						System.out.println("\nOs n�meros em ordem crescente �: "+n2+", "+n1+" e "+n3);
					}
			else
						System.out.println("\nOs n�meros em ordem crescente �: "+n2+", "+n3+" e "+n1);
			}
			else
					{
						System.out.println("\nOs n�meros em ordem crescente �: "+n3+", "+n2+" e "+n1);
					}
			
	}

}
