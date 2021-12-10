//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_1_WHILE
{

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		int idade, idadeMenosVinte=0, idadeMaisCinquenta=0;
		
		System.out.println("\nEntre com a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
			if(idade < 21)
			{
				idadeMenosVinte++;
			}
			if(idade > 50)
			{
				idadeMaisCinquenta++;
			}
			System.out.println("\nEntre com a idade: ");
			idade = leia.nextInt();
		}
			System.out.println("\nVocê inseriu -99 e isso interrompe o programa!");	
			System.out.println("\nO número de pessoas com menos de 21 anos é: "+idadeMenosVinte);
			System.out.println("\nO número de pessoas com mais de 50 anos é: "+idadeMaisCinquenta);
	}

}
