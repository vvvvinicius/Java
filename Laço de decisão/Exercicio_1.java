// Faça um programa que receba três inteiros e diga qual deles é o maior.

package LacoDecisao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3;
			
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextDouble();
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextDouble();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = leia.nextDouble();
		
		if(n1 > n2 && n1 > n3)
			{
				System.out.println("\nO maior número inserido foi o: "+n1);
			}
		
		else if(n2 > n1 && n2 > n3)
			{
				System.out.println("\nO maior número inserido foi o: "+n2);
			}
		else
			{
				System.out.println("\nO maior número inserido foi o: "+n3);
			}
		
	}

}
