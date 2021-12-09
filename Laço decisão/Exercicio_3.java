// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
// 10-14 infantil
// 15-17 juvenil
// 18-25 adulto


package LacoDecisao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nEntre com a idade para descobrir em qual grupo pertence: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
			{
				System.out.println("\nA idade pertence ao grupo infantil.");
			}
		
		else if(idade >= 15 && idade <= 17)
			{
				System.out.println("\nA idade pertence ao grupo juvenil.");
			}
		else if(idade >= 18 && idade <= 25)
			{
				System.out.println("\nA idade pertence ao grupo adulto.");
			}
		else
			{
				System.out.println("\nA pesquisa é para pessoas entre 10 e 25 anos e a idade inserida foi: "+idade);
			}
	}

}
