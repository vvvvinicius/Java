// Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias;
		
		System.out.println("\nEntre com a quantidade de dias que j� viveu:");
		dias = leia.nextInt();
		
		System.out.println("\nVoc� j� viveu "+dias/365+" ano(s)");
		System.out.println("\nVoc� j� viveu "+dias/30+" m�s/meses.");
		System.out.println("\nVoc� j� viveu "+dias+" dia(s).");
	}

}
