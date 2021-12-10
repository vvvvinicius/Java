/*
 Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 No final, mostre a soma dos números digitados.(DO...WHILE)
*/
package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_1_DO_WHILE {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, soma=0;
		
		do
		{
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			
			soma += numero;
			
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		  	while(numero != 0);

		System.out.println("\nVocê inseriu o número 0 e o programa foi interrompido. A soma dos números inseridos é de: "+soma);
	}
	 

}
