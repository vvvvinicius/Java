// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
// Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

package LacoDecisao;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
			System.out.println("\nEntre com um n�mero inteiro: ");
			numero = leia.nextInt();
			
			if(((numero/2) + (numero/2))==numero)
			{
				System.out.println("\nO n�mero inserido � par e a ra�z quadrada dele �: "+Math.sqrt(numero));
			}
			else
			{
				System.out.println("\nO n�mero inserido � impar e a eleva��o ao quadrado �: "+Math.pow(numero, 2));
			}
	}

}
