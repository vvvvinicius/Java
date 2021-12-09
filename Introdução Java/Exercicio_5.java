// Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,media;
		int peso1=2,peso2=3,peso3=5;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.println("\nEntre com a primeira nota:");
				nota1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota:");
				nota2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota:");
				nota3 = leia.nextFloat();
		
				media =(float) (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
				
			System.out.println("A média ponderada considerando os pesos é: "+media);
	}

}
