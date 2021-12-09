//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
// Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 

package ExerciciosJava;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		float consumidor,distribuidor,imposto,custo;
			
		System.out.println("\nQual é o valor de fábrica do carro?");
		custo = leia.nextFloat();
			
			distribuidor = (custo*28) / 100;
			imposto = (custo*45) / 100;
			consumidor = custo + imposto + distribuidor;
				
			System.out.println("\nO custo de fábrica do carro é R$: "+custo+", então, o custo para o consumidor é R$: "+consumidor+".");
			
	}

}
