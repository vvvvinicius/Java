//Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos;
		
			System.out.println("\nEntre com a quantidade de segundos de dura��o do evento:");
			segundos = leia.nextInt();
			
			System.out.println("\nO evento durou: "+segundos/3600+ " hora(s)");
			System.out.println("\nO evento durou: "+segundos/60+" minuto(s)");
			System.out.println("\nO evento durou: "+segundos+" segundo(s)");
	}

}
