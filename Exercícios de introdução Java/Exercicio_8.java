//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
// Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		float consumidor,distribuidor,imposto,custo;
			
		System.out.println("\nQual � o valor de f�brica do carro?");
		custo = leia.nextFloat();
			
			distribuidor = (custo*28) / 100;
			imposto = (custo*45) / 100;
			consumidor = custo + imposto + distribuidor;
				
			System.out.println("\nO custo de f�brica do carro � R$: "+custo+", ent�o, o custo para o consumidor � R$: "+consumidor+".");
			
	}

}
