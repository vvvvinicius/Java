// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package LacoDecisao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3;
			
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextDouble();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextDouble();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = leia.nextDouble();
		
		if(n1 > n2 && n1 > n3)
			{
				System.out.println("\nO maior n�mero inserido foi o: "+n1);
			}
		
		else if(n2 > n1 && n2 > n3)
			{
				System.out.println("\nO maior n�mero inserido foi o: "+n2);
			}
		else
			{
				System.out.println("\nO maior n�mero inserido foi o: "+n3);
			}
		
	}

}
