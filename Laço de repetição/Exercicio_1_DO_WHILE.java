/*
 Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 No final, mostre a soma dos n�meros digitados.(DO...WHILE)
*/
package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_1_DO_WHILE {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, soma=0;
		
		do
		{
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();
			
			soma += numero;
			
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();
		}
		  	while(numero != 0);

		System.out.println("\nVoc� inseriu o n�mero 0 e o programa foi interrompido. A soma dos n�meros inseridos � de: "+soma);
	}
	 

}
