/*
1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package Arrays;

public class Exerc�cio_Arrays_1 {

	public static void main(String[] args) {

		int A[] = {1, 0, 5, -2, -5, 7};
		int soma, x;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("\nO resuldado da soma de A[0], A[1] e A[5] �: "+soma);
		
		A[4] = 100;
		
			for(x=0;x<6;x++)
			{
				System.out.println("\nO valor de cada linha da linha "+x+" do vetor A �: "+A[x]);
			}
	}

}
