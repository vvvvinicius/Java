// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int x=1000;
				
				for(x=1000;x<2000;x++)
				{
					if(x % 11 == 5)
					{
						System.out.println("\n"+x);
					}
				}
	}

}
