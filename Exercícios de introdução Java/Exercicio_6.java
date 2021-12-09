// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
// A fórmula que efetua tal cálculo é: D = √(x2 - x1)^2 + (y2 - y1)^2

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2,dx,dy,dxy,distanciaP;
			
		System.out.println("\nEntre com valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("\nEntre com valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("\nEntre com valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("\nEntre com valor de y2: ");
		y2 = leia.nextDouble();
		
			dx = Math.pow((x2-x1), 2);
			dy = Math.pow((y2-y1), 2);
			dxy = dx + dy;
			distanciaP = Math.sqrt(dxy);
			
			System.out.printf("\nA distância entre os pontos no plano é de %.2f",distanciaP);
	}

}
