/*
Escrever um programa que receba v�rios n�meros inteiros no teclado.
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

*/
package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_2_DO_WHILE {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero,soma=0,multiplo=0;
		float media=0;
		
		do
		{
			System.out.println("\nEntre com o valor: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0)
			{
				soma += numero;
				multiplo++;
				
				media = soma / multiplo;
			}
		}
		while(numero != 0);
		
		System.out.printf("\nVoc� inseriu o n�mero 0 e o programa foi interrompido. A soma dos n�meros m�ltiplos de 3 �: "+soma+ " e a m�dia dos n�meros m�ltiplos de 3 �: %.2f",media);
	}

}
