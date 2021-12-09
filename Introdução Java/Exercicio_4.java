//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
// D = (R+S)/2, onde R=(A+B)^2 e S=(B+C)^2

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_4 {


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A,B,C;
		double R,S,D;
		
			System.out.println("\nEntre com o valor de A:");
			A = leia.nextInt();
			System.out.println("\nEntre com o valor de B:");
			B = leia.nextInt();
			System.out.println("\nEntre com o valor de C:");
			C = leia.nextInt();
			
			R =(int) Math.pow((A+B), 2);
			S =(int) Math.pow((B+C), 2);
			D =(double) (R+S)/2;
			
			System.out.println("\nO valor de R é "+R);
			System.out.println("\nO valor de S é "+S);
			System.out.println("\nO valor de D é "+D);
	}

}
