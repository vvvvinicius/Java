// Um sistema de equações lineares do tipo: ax + by = c e dx + ey = f
// pode ser resolvido segundo mostrado abaixo:
// x = (c*e - b* f) / (a*e - b*d) e y = (a*f - c*d) / (a*e - b*d)
// Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float a,b,c,d,e,f,x,y;
		
			System.out.println("\nEntre com valor de a:");
			a = leia.nextFloat();
			System.out.println("\nEntre com valor de b:");
			b = leia.nextFloat();
			System.out.println("\nEntre com valor de c:");
			c = leia.nextFloat();
			System.out.println("\nEntre com valor de d:");
			d = leia.nextFloat();
			System.out.println("\nEntre com valor de e:");
			e = leia.nextFloat();
			System.out.println("\nEntre com valor de f:");
			f = leia.nextFloat();
			
			x = (c*e - b*f) / (a*e - b*d);
			y = (a*f - c*d) / (a*e - b*d);
			
				System.out.printf("\nO valor de x é %.2f",x);
				System.out.printf("\nO valor de y é %.2f",y);
	}

}
