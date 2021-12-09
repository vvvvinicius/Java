//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
	int anos,meses,dias,total;
		
			System.out.println("\nEntre com a quantidade de anos vividos:");
			anos = leia.nextInt();
			System.out.println("\nEntre com a quantidade de meses vividos:");
			meses = leia.nextInt();
			System.out.println("\nEntre com a quatidade de dias vividos:");
			dias = leia.nextInt();
			
			total = anos*365 + meses*30 + dias;
					
					System.out.println("\nVocê já viveu "+total+" dias.");
		
	}

}
