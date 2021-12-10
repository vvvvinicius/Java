/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o n�mero de pessoas calmas;
- o n�mero de mulheres nervosas;
- o n�mero de homens agressivos;
- o n�mero de outros calmos;
- o n�mero de pessoas nervosas com mais de 40 anos;
- o n�mero de pessoas calmas com menos de 18 anos. */

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio_2_WHILE {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade,sexo,tipo,pessoa=1,calmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0,nervosasMaisQ=0,calmasMenosD=0;
		
		while(pessoa<=4)
		{
			System.out.println("\nEntre com a idade da "+pessoa+"� pessoa:");
			idade = leia.nextInt();
		
			System.out.println("\nInforme o sexo da "+pessoa+" � pessoa:");
			System.out.println("\n1 - Feminino");
			System.out.println("\n2 - Masculino");
			System.out.println("\n3 - Outros");
			sexo = leia.nextInt();
	
				if(sexo != 1 && sexo !=2 && sexo !=3)
					{
						System.out.println("\nAten��o! Voc� inseriu uma op��o inv�lida que ir� interferir no resultado final! Por favor, reinicie a pesquisa e a responda usando uma op��o v�lida.");
					}
		
			System.out.println("\nInforme o temperamento da "+pessoa+"� pessoa:");
			System.out.println("\n1 - Pessoa calma");
			System.out.println("\n2 - Pessoa nervosa");
			System.out.println("\n3 - Pessoa agressiva");
			tipo = leia.nextInt();
		
				if(tipo != 1 && tipo !=2 && tipo !=3)
					{
						System.out.println("\nAten��o! Voc� inseriu uma op��o inv�lida que ir� interferir no resultado final! Por favor, reinicie a pesquisa e a responda usando uma op��o v�lida.");
					}
		
				if(tipo == 1)
					{
						calmas++;
					}
				
				if(sexo == 1 && tipo == 2)
					{
						mulheresNervosas++;
					}
				if(sexo == 2 && tipo == 3)
					{
						homensAgressivos++;
					}
				if(sexo == 3 && tipo == 1)
					{
						outrosCalmos++;
					}
				if(idade > 40 && tipo == 2)
					{
						nervosasMaisQ++;
					}
				if(idade < 18 && tipo ==1)
					{
						calmasMenosD++;
					}
			
			pessoa++;
		}
		
		{
			System.out.println("\nPesquisa finalizada! O resultador �...");
		}
		
		
		System.out.println("\nO n�mero de pessoas calmas �: "+calmas);
		System.out.println("\nO n�mero de mulheres nervosas �: "+mulheresNervosas);
		System.out.println("\nO n�mero de homens agressivos �: "+homensAgressivos);
		System.out.println("\nO n�mero de outros calmos �: "+outrosCalmos);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos �: "+nervosasMaisQ);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos �: "+calmasMenosD);
	}

}
