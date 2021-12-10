// Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
// Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

package LacoDecisao;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
			System.out.println("\nEntre com um número inteiro: ");
			numero = leia.nextInt();
			
			if(((numero/2) + (numero/2))==numero)
			{
				System.out.println("\nO número inserido é par e a raíz quadrada dele é: "+Math.sqrt(numero));
			}
			else
			{
				System.out.println("\nO número inserido é impar e a elevação ao quadrado é: "+Math.pow(numero, 2));
			}
	}

}
